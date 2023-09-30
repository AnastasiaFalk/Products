package Main;

import Products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[]{ // створення масиву з продуктами
                new Product(1, "Яблуко", "Apple Inc.", 2, 3, 10), // створення окремого продукта, задання його характеристик
                new Product(2, "Яблуко", "Яблучна фабрика", 5, 3, 16),
                new Product(3, "Банан", "Chiquita", 1, 5, 30),
                new Product(4, "Молоко", "Галичина", 32, 10, 15),
                new Product(5, "Молоко", "Молокія", 3, 15, 15),
                new Product(6, "Хліб", "Житні вироби", 2, 3, 40)
        };

        Scanner scanner = new Scanner(System.in); // задання сканнера для можливості зчитування інформації, введеної користувачем

        System.out.println("Введіть назву продукта: "); // текст для користувача про введення назви продукта, інформацію про який потрібно вивести
        String name = scanner.nextLine(); // введення назви продукту
        System.out.println("Продукти з назвою '" + name + "':"); // виведення назви продукту, інформацію про який потрібно вивести
        for (Product product : products) { // цикл, який проходить по всьому масиву продуктів
            if (product.getName().equals(name)) { // перевірка, чи назва продукту збігається з введеною користувачем назвою
                // виведення інформації про продукт
                System.out.println(product);
            }
        }

        System.out.println("Введіть ціну: "); // текст для користувача про введення ціни
        double price = scanner.nextDouble(); // введення ціни
        System.out.println("Продукти '" + name + "', дешевші за " + price + "грн."); // виведення інформації
        for (Product product : products) { // цикл, який проходить по всьому масиву продуктів
            if (product.getName().equals(name) && product.getPrice() <= price) { // перевірка, чи назва продукту збігається з введеною користувачем назвою та перевірка, чи ціна не перевищує задану
                // виведення інформації про продукт
                System.out.println(product);
            }
        }

        System.out.println("Введіть термін придатності: "); // текст для користувача про введення терміна придатності
        int shelfLife = scanner.nextInt(); // введення терміна придатності
        System.out.println("Продукти, що зберігаються довше, ніж " + shelfLife + " днів:"); // виведення інформації
        for (Product product : products) { // цикл, який проходить по всьому масиву продуктів
            if (product.getShelfLife() >= shelfLife) { // перевірка терміну придатності продуктів, чи не є замалим число, введене користувачем
                // виведення інформації про продукт
                System.out.println(product);
            }
        }
    }
}