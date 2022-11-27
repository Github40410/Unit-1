package ru.vsuet.cardealership.Service;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Category;

import java.util.List;

public interface Service<T>{
    T getByIdCar(Long id);
    List<T> getAllCar();
    void sellAvto(T source, Bayer bayer);
    void addBayer(Bayer source);
    void addCar(T source);
    void remuweCar(T source);
    void addCategory(Category source);
}
