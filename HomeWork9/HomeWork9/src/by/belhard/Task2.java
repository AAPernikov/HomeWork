package by.belhard;

import by.belhard.model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Bread");
        Product product2 = new Product(234, "Milk");
        Product product3 = new Product(507, "Meat");
        Product product4 = new Product(789, "Orange");

        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(product1.getCode(), product1);
        productMap.put(product2.getCode(), product2);
        productMap.put(product3.getCode(), product3);
        productMap.put(product4.getCode(), product4);

        printEntries(productMap);
        printKeys(productMap);
        printValues(productMap);

    }

    private static void printEntries(Map<Integer, Product> productMap) {
        Set<Map.Entry<Integer, Product>> entries = productMap.entrySet();
        for (Map.Entry<Integer, Product> entry : entries) {
            System.out.println("Key= " + entry.getKey());
            System.out.println("value= " + entry.getValue());
        }
    }

    private static void printKeys(Map<Integer, Product> productMap) {
        System.out.println("Вывести все ключи");
        Set<Integer> keyS = productMap.keySet();
        for (Integer key : keyS) {
            System.out.println(key);
        }
    }

    private static void printValues(Map<Integer, Product> productMap) {
        System.out.println("Вывести все объекты");
        Collection<Product> values = productMap.values();
        for (Product value : values) {
            System.out.println(value);
        }

    }
}
