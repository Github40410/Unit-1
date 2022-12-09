package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Bayer;

public interface GetIdBayer<T> {
    Long getId(T source);
}
