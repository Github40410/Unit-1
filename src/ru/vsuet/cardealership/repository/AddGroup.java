package ru.vsuet.cardealership.repository;


import ru.vsuet.cardealership.domain.Car;

public interface AddGroup<T> {
    void addVGroup(T group, Long id);
}
