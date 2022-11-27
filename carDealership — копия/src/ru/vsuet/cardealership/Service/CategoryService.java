package ru.vsuet.cardealership.Service;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Category;
import ru.vsuet.cardealership.repository.InMemoryRepositoryBayer;
import ru.vsuet.cardealership.repository.InMemoryRepositoryCar;
import ru.vsuet.cardealership.repository.InMemoryRepositorySellCar;
import ru.vsuet.cardealership.repository.Repository;

import java.util.List;

public class CategoryService implements  Service<Category> {
    private Repository<Category> repositoryCar = new InMemoryRepositoryCar();
    private Repository<Bayer> repositoryBayer = new InMemoryRepositoryBayer();
    private Repository<Category> repositorySellCar = new InMemoryRepositorySellCar();


    @Override
    public Category getByIdCar(Long id) {
        return repositoryCar.find(id);
    }

    @Override
    public List<Category> getAllCar() {
        return repositoryCar.list();
    }

    @Override
    public void sellAvto(Category source, Bayer bayer) {
        repositoryBayer.add(bayer);
        repositorySellCar.add(source);
        repositoryCar.remove(source);
    }

    @Override
    public void addBayer(Bayer source) {
        repositoryBayer.add(source);
    }

    @Override
    public void addCar(Category source) {
        repositoryCar.add(source);
    }

    @Override
    public void remuweCar(Category source) {
        repositoryCar.remove(source);
    }

    @Override
    public void addCategory(Category source) {
        repositoryCar.add(source);
    }
}
