package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;
import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.repository.InMemoryRepositoryBayer;

import java.util.Base64;
import java.util.Scanner;

public class AddCar<T> extends AbstractComponent<T> {
    public AddCar(Service<T> service){
        super(ComponentType.ADDCAR, service);
    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        Long id = scanner.nextLong();
        System.out.println("Model: ");
        System.out.println("");
        String mod = scanner.nextLine();
        System.out.println("Marca: ");
        String mar = scanner.nextLine();
        Car car = new Car(id, mod, mar);
        super.draw();
    }
}
