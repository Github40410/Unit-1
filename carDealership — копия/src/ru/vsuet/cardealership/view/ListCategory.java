package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;

public class ListCategory<T> extends AbstractComponent<T>{

    public ListCategory(Service<T> service) {
        super(ComponentType.LISTCATEGORY, service);
    }

    @Override
    public void draw() {
        System.out.println(service.getAllCar());
    }
}
