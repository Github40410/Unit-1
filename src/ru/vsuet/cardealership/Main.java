package ru.vsuet.cardealership;

import ru.vsuet.cardealership.Service.CategoryService;
import ru.vsuet.cardealership.Service.Service;
import ru.vsuet.cardealership.domain.Category;
import ru.vsuet.cardealership.view.Component;
import ru.vsuet.cardealership.view.ComponentFabric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Service<Category> service = new CategoryService();
        ComponentFabric fabric = new ComponentFabric();
        System.out.println("------- 0 - menu -----------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            Component component = fabric.build(command, service);
            if (component == null) {
                return;
            }
            component.draw();
        }
    }
}
