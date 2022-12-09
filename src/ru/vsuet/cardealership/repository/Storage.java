package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Storage {
    private static Storage instance;

    public static Storage getInstance(){
        if(instance==null){
            instance = new Storage();
        }
        return instance;
    }

    List<Category> categories;
    List<Bayer> bayers;

    private Storage(){
        categories = new ArrayList<>();
        bayers = new ArrayList<>();
    }

}
