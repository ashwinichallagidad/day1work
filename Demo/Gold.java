class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Gold {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());
    }
}
