package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;

public class ListBayer<T> extends AbstractComponent<T>{

    public ListBayer(Service<T> service) {
        super(ComponentType.LISTCATEGORY, service);
    }

    @Override
    public void draw() {
        System.out.println(service.getAllCar());
    }
}
