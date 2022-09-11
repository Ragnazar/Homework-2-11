package pro.sky.homeworks.homework211.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeworks.homework211.dto.Product;
import pro.sky.homeworks.homework211.services.BasketService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Product> addOrder(@RequestParam("orderId") List<Integer> orderId) {
        return basketService.addOrder(orderId);
    }

    @GetMapping(path = "/get")
    public List<Product> getAll() {
        return basketService.getAll();
    }
}
