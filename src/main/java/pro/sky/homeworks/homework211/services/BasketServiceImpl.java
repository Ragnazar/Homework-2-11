package pro.sky.homeworks.homework211.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homeworks.homework211.dto.Product;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final List<Product> basket = new ArrayList<>();

    @Override
    public List<Product> addOrder(List<Integer> orderId) {
        List<Product> result = new ArrayList<>();
        for (Integer integer : orderId) {
            Product product = new Product(integer);
            basket.add(product);
            result.add(product);
        }
        return new ArrayList<>(result);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(basket);
    }

}
