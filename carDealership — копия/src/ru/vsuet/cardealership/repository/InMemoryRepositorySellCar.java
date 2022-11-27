package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Category;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepositorySellCar implements Repository<Category>{

    private final List<Category> categories;

    public InMemoryRepositorySellCar(){
        this.categories = Storage.getInstance().categories;
    }

    @Override
    public Category find(Long id) {
        return categories.stream().filter(c -> id.equals(c.getId())).findFirst().orElse(null);
    }

    @Override
    public void add(Category source) {
        categories.add(source);
    }

    @Override
    public void remove(Category source) {
        categories.removeIf(c -> source.getId().equals(c.getId()));
    }

    @Override
    public List<Category> list() {
        return new ArrayList<>(categories);
    }
}
