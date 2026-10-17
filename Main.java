public class Main {
    public static void main(String[] args) {
        // Exercise 1 - Student
        System.out.println("--- Exercise 1: Students ---");
        Student student1 = new Student();
        student1.name = "Mary";
        student1.studentNumber = "S1001";
        student1.programme = "Computer Science";

        Student student2 = new Student();
        student2.name = "John";
        student2.studentNumber = "S1002";
        student2.programme = "Information Systems";

        student1.displayDetails();
        student2.displayDetails();

        // Checkpoint: changing student1.name does not change student2.name
        student1.name = "Maria";
        student1.displayDetails();
        student2.displayDetails();

        // Exercise 2 - Car
        System.out.println("\n--- Exercise 2: Cars ---");
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";

        car1.accelerate();
        car1.accelerate();
        car1.accelerate();

        car2.accelerate();

        car1.displayInfo();
        car2.displayInfo();

        // Exercise 3 - Product
        System.out.println("\n--- Exercise 3: Products ---");
        Product p1 = new Product();
        p1.name = "Keyboard";
        p1.price = 350.0;
        p1.quantity = 4;

        Product p2 = new Product();
        p2.name = "Mouse";
        p2.price = 150.0;
        p2.quantity = 10;

        Product p3 = new Product();
        p3.name = "Monitor";
        p3.price = 2200.0;
        p3.quantity = 2;

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        // Exercise 4 - Project entity: Expense
        System.out.println("\n=== Exercise 4: Patients ===");
        Patient patient1 = new Patient();
        patient1.name = "Chanda Mwila";
        patient1.reason = "Fever and headache";
 
        Patient patient2 = new Patient();
        patient2.name = "Mwansa Phiri";
        patient2.reason = "Broken arm";
 
        patient1.advanceStatus();
        patient1.advanceStatus();          // Waiting for Doctor
        patient1.assignDoctor("Dr. Banda");
        patient2.toggleUrgent();
 
        patient1.displayPatient();
        patient2.displayPatient();         // unchanged by patient1's updates
 
    }
}
