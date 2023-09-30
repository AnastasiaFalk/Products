package Products;

public class Product {
    // задання приватних полів класу
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;

    // конструктор класу
    public Product(int id, String name, String manufacturer, double price, int shelfLife, int quantity) { // конструктор класу `Product`, який приймає шість параметрів
        this.id = id; // присвоює переданий параметр `id` полю `id` нового об'єкта
        this.name = name; // присвоює переданий параметр `name` полю `name` нового об'єкта
        this.manufacturer = manufacturer; // присвоює переданий параметр `manufacturer` полю `manufacturer` нового об'єкта
        this.price = price; // присвоює переданий параметр `price` полю `price` нового об'єкта
        this.shelfLife = shelfLife; // присвоює переданий параметр `shelfLife` полю `shelfLife` нового об'єкта
        this.quantity = quantity; // присвоює переданий параметр `quantity` полю `quantity` нового об'єкта
    }

    // геттери і сеттери для кожного поля класу
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getShelfLife() {
        return shelfLife;
    }
    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // перевизначений метод toString()
    @Override
    public String toString() { // перевизначає метод `toString()` класу `Object`, повертає текстове представлення об'єкта `Product`
        return
                "----------------" + '\n' +
                "- Продукт " + name + ":" + '\n' +
                "- ID: " + id + '\n' +
                "- Виробник: " + manufacturer + '\n' +
                "- Ціна: " + price + "грн" + '\n' +
                "- Кількість: " + quantity + "шт." +'\n' +
                "- Термін придатності: " + shelfLife + " днів" + '\n' + "----------------";
    }
}
