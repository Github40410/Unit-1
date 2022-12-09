package ru.vsuet.cardealership.repository;

import java.util.List;

public interface Repository<T> {
    T find(Long id);
    void add(T source);
    void remove(T source);
    List<T> list();
}
