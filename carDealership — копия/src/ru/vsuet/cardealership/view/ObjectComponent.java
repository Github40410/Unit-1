package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;

public class ObjectComponent<T> extends AbstractComponent<T>{
    public ObjectComponent(Service<T> service){
        super(ComponentType.LIST, service);
    }

    @Override
    public void draw() {
        System.out.println("Object list car: ");
        service.getAllCar().forEach(System.out::println);
    }
}
