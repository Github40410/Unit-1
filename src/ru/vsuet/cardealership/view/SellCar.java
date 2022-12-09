package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;
import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;
import ru.vsuet.cardealership.domain.Gender;

import java.util.Scanner;

public class SellCar<T> extends AbstractComponent<T> {
    public SellCar(Service<T> service){
        super(ComponentType.SELLCAR, service);
    }

    @Override
    public void draw() {
        Car car = service.vvodCar();
        Bayer bayer = service.vvodBayer();
        System.out.println(car);
        System.out.println(bayer);
        service.sellAvto(car, bayer);
        super.draw();
    }
}
