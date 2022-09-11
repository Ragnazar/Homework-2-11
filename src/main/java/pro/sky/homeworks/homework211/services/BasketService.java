package pro.sky.homeworks.homework211.services;

import pro.sky.homeworks.homework211.dto.Product;

import java.util.List;

public interface BasketService {
    Product addOrder(int orderId);


    List<Product> getAll();
}
