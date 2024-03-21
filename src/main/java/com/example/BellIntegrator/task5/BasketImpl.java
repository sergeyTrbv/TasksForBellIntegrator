package com.example.BellIntegrator.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

    private final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        int currentQuantity = products.getOrDefault(product, 0);
        products.put(product, currentQuantity + quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
            System.out.println("Количество продукта '" + product + "' обновлено на: " + quantity);
        } else {
            System.out.println("Продукт '" + product + "' отсутствует в корзине.");
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }


    public static void main(String[] args) {

        BasketImpl basket = new BasketImpl();

        // Добавление продуктов в корзину
        basket.addProduct("Хлеб", 2);
        basket.addProduct("Колбаса", 1);
        basket.addProduct("Сыр", 3);

        // Получение списка продуктов в корзине после добавления
        System.out.println("Продукты в корзине: " + basket.getProducts());

        // Удаление продукта из корзины
        basket.removeProduct("Хлеб");
        System.out.println("Продукты в корзине после удаления хлеба: " + basket.getProducts());

        // Обновление количества продукта в корзине
        basket.updateProductQuantity("Сыр", 5);
        System.out.println("Новое количество сыра в корзине: " + basket.getProductQuantity("Сыр"));

        // Получение количества конкретного продукта
        System.out.println("Количество колбасы в корзине: " + basket.getProductQuantity("Колбаса"));

        // Очистка корзины
        basket.clear();
        System.out.println("Продукты в корзине после очистки: " + basket.getProducts());
    }
}
