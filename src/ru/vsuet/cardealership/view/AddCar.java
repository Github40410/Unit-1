package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;

import java.util.Scanner;

public class AddCar<T> extends AbstractComponent<T> {
    public AddCar(Service<T> service){
        super(ComponentType.ADDCAR, service);
    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Model: ");
        System.out.println("");
        String mod = scanner.nextLine();
        System.out.println("Marca: ");
        String mar = scanner.nextLine();
        Car car = new Car( mod, mar);
        System.out.println("Category: ");
        String category = scanner.nextLine();
        Category categ = new Category(category);
        service.addCar((T)categ, car);
        super.draw();
    }
}
