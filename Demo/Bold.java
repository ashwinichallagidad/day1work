class Laptop {
    String brand;
    int ram;       
    double price; 
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Bold {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 16, 75000.0);
        Laptop laptop2 = new Laptop("HP", 8, 55000.0);
        laptop1.displayDetails();
        laptop2.displayDetails();
    }
}
