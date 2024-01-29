
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private int rating;
    
        public Product(String name, double price, int rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }
    
        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + ", rating=" + rating + "}";
        }
    }
    
    class Category {
        private String name;
        private List<Product> products;
    
        public Category(String name, List<Product> products) {
            this.name = name;
            this.products = products;
        }
    
        public List<Product> getProducts() {
            return products;
        }
    
        @Override
        public String toString() {
            return "Category{name='" + name + "', products=" + products + "}";
        }
    }
    
    class Basket {
        private List<Product> products;
    
        public Basket() {
            this.products = new ArrayList<>();
        }
    
        public void addProduct(Product product) {
            products.add(product);
        }
    
        public List<Product> getProducts() {
            return products;
        }
    
        public void removeProduct(Product product) {
            products.remove(product);
        }
    }
    
    class User {
        private String username;
        private String password;
        private Basket basket;
    
        public User(String username, String password, Basket basket) {
            this.username = username;
            this.password = password;
            this.basket = basket;
        }
    
        public String getUsername() {
            return username;
        }
    
        public Basket getBasket() {
            return basket;
        }
    }
}