public class Product {
    String name;
    double price;
    int quantity;
 
    double totalValue() {
        return price * quantity;
    }
 
    void displayProduct() {
        System.out.println(name + " | K" + price + " | Qty: " + quantity + " | Total: K" + totalValue());
    }
}
 
