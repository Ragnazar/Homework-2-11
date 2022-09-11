package pro.sky.homeworks.homework211.services;

import pro.sky.homeworks.homework211.dto.Product;

import java.util.List;

public interface BasketService {
    List<Product> addOrder(List<Integer> id);


    List<Product> getAll();
}
