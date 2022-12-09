package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;

import java.util.HashMap;
import java.util.Map;

public class ComponentFabric {
    private final Map<ComponentType, Component> components;

    public ComponentFabric(){
        this.components = new HashMap<>();
    }

    public <T> Component build(int type, Service<T> service){
        try{
            ComponentType componentType = ComponentType.fromType(type);
            return components.computeIfAbsent(componentType, (c) -> {
                Component component;
                switch (componentType){
                    case MENU -> component = new MenuComponent();
                    case SINGLE -> component = new ObjectComponent<>(service);
                    case ADDCAR -> component = new AddCar<>(service);
                    case ADDCATEGORY -> component = new AddCategory<>(service);
                    case LISTCATEGORY -> component = new ListCategory<>(service);
                    case SELLCAR -> component = new SellCar<>(service);
                    case LISTBAYER -> component = new ListBayer<>(service);
                    default -> component = null;
                }
                return component;
            });
        }catch(IllegalArgumentException e){
            return null;
        }
    }
}
