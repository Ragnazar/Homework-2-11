package pro.sky.homeworks.homework211.dto;

import java.util.Objects;

public class Product {
    private final int id;

    public Product(int id) {
        this.id = id;
    }

    public int getProduct() {
        return id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product basket = (Product) o;
        return id == basket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
