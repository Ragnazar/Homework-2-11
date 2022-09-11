package pro.sky.homeworks.homework211.services;

import org.springframework.stereotype.Service;
import pro.sky.homeworks.homework211.dto.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final List<Product> basket = new ArrayList<>();

    @Override
    public Product addOrder(int orderId) {
        Product product = new Product(orderId);
        basket.add(product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(basket);
    }

}
