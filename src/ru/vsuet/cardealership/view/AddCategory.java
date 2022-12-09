package ru.vsuet.cardealership.view;

import ru.vsuet.cardealership.Service.Service;
import ru.vsuet.cardealership.domain.Category;

import java.util.Scanner;

public class AddCategory<T> extends AbstractComponent<T> {
    public AddCategory(Service<T> service){
        super(ComponentType.ADDCATEGORY, service);
    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        Category category = new Category(name);
        System.out.println(category);
        service.addCategory(category);
        super.draw();
        System.out.println("Я работаю");
    }
}