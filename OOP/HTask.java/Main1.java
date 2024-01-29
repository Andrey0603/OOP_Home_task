import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // Создаем каталог продуктов
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Товар1", 100.0, 5));
        productList.add(new Product("Товар2", 200.0, 4));
        productList.add(new Product("Товар3", 150.0, 4));

        System.out.println("Каталог продуктов магазина:");
        for (Product product : productList) {
            System.out.println(product);
        }

        // Создаем пользователей и покупаем продукты
        Basket basket1 = new Basket();
        User user1 = new User("user1", "password1", basket1);
        basket1.addProduct(productList.get(0)); // Добавляем товар в корзину пользователя

        System.out.println("Покупки посетителей магазина:");
        System.out.println("Пользователь " + user1.getUsername() + " приобрел: " + user1.getBasket().getProducts());
        
        // Удаляем товар из каталога
        productList.remove(productList.get(0));
    }
}    
