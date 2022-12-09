package ru.vsuet.cardealership.view;

import java.util.Arrays;

public class MenuComponent extends AbstractComponent<Void> {
    public MenuComponent(){
        super(ComponentType.MENU, null);
    }

    @Override
    public void draw() {
        drowMenu();
    }

    private void drowMenu(){
        System.out.println("****** MENU ******");
        Arrays.stream(ComponentType.values()).forEach(c -> System.out.println(c.getType() + " " + c.getComment()));
        System.out.println("9 - Exit");
        System.out.println("------------------------");
    }
}
