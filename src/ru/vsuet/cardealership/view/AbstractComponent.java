package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;

public class AbstractComponent<T> implements Component{
    protected ComponentType type;
    protected final Service<T> service;

    public AbstractComponent(ComponentType type, Service<T> service){
        this.type = type;
        this.service = service;
    }

    public ComponentType getType() {
        return type;
    }

    @Override
    public void draw() {

    }
}
