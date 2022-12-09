package ru.vsuet.cardealership.Service;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;
import ru.vsuet.cardealership.domain.Gender;
import ru.vsuet.cardealership.repository.*;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Scanner;

public class CategoryService implements  Service<Category> {
    private DataBaseConnector connector = new DataBaseConnector();
    private DataBaseTypeRepository repositoryCar = new DataBaseTypeRepository(connector);
    private DataBaseCarRepository repositoryCarInSalon = new DataBaseCarRepository(connector);
    private DataBaseBayerRepository repositoryBayer = new DataBaseBayerRepository(connector);
    private DataBaseSellCarRepository repositorySellCar = new DataBaseSellCarRepository(connector);


    @Override
    public Category getByIdCar(Long id) {
        return repositoryCar.find(id);
    }

    @Override
    public List<Category> getAllCar() {
        List<Category> categories = repositoryCar.list();
        List<Car> cars = repositoryCarInSalon.list();
        for(Category cat: categories){
            List<Car> carn = cars.stream().filter(c->cat.getId().equals(c.getIdType())).toList();
            if(carn!=null){
                int id = categories.indexOf(cat);
                for(Car car: carn) {
                    categories.get(id).addCar(car);
                }
            }
        }
        return categories;
    }

    @Override
    public void sellAvto(Car car, Bayer bayer) {
        repositoryBayer.add(bayer);
        Long id = repositoryBayer.getId(bayer);
        repositorySellCar.addCar(car, id);
        repositoryCarInSalon.remove(car);
    }

    @Override
    public void addBayer(Bayer source) {
        repositoryBayer.add(source);
    }

    @Override
    public void addCar(Category group, Car car) {
        Long id = repositoryCar.GetId(group);
        repositoryCar.addVGroup(car, id);
    }

    @Override
    public void remuweCar(Category source) {
        repositoryCar.remove(source);
    }

    @Override
    public void addCategory(Category source) {
        repositoryCar.add(source);
    }

    public Bayer vvodBayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        Long age = scanner.nextLong();
        System.out.println("1 - MALE      2 - FEMALE");
        Long number = scanner.nextLong();
        if(number.equals(1l)){
            Bayer bayer = new Bayer(age, name, Gender.MALE);
            return  bayer;
        }
        else if(number.equals(2l)){
            Bayer bayer = new Bayer(age, name, Gender.FEMALE);
            return  bayer;
        }
        return  null;
    }


    public Car vvodCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Model: ");
        String mod = scanner.nextLine();
        System.out.println("Marca: ");
        String mar = scanner.nextLine();
        Car car = new Car( mod, mar);
        return  car;
    }
}
