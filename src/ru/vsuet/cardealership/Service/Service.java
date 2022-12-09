package ru.vsuet.cardealership.Service;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;

import java.util.List;

public interface Service<T>{
    T getByIdCar(Long id);
    List<T> getAllCar();
    void sellAvto(Car car, Bayer bayer);
    void addBayer(Bayer source);
    void addCar(T source, Car car);
    void remuweCar(T source);
    void addCategory(Category source);
    Bayer vvodBayer();
    Car vvodCar();
}
