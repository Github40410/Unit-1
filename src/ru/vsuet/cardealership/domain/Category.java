package ru.vsuet.cardealership.domain;


import java.util.ArrayList;
import java.util.List;

public class Category {
    private Long id;
    private String name;
    private List<Car> cars;

    public Category(Long id, String name){
        this.id = id;
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public Category(String name){
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
