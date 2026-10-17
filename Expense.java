public class Expense {
    String description;
    String category;
    double amount;

    boolean isLarge() {
        return amount >= 500;
    }

    void displayExpense() {
        System.out.println(description + " | " + category + " | K" + amount + " | Large: " + isLarge());
    }
}
