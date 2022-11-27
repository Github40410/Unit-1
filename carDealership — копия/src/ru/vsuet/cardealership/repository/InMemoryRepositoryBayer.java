package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Bayer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepositoryBayer implements Repository<Bayer>{

    private final List<Bayer> bayers;

    public InMemoryRepositoryBayer(){
        this.bayers = Storage.getInstance().bayers;
    }

    @Override
    public Bayer find(Long id) {
        return bayers.stream().filter(c -> id.equals(c.getId())).findFirst().orElse(null);
    }

    @Override
    public void add(Bayer source) {
        bayers.add(source);
    }

    @Override
    public void remove(Bayer source) {
        bayers.removeIf(c -> source.getId().equals(c.getId()));
    }

    @Override
    public List<Bayer> list() {
        return new ArrayList<Bayer>();
    }
}
