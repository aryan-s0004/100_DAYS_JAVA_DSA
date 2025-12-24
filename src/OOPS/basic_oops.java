package OOPS;

// Car class represents a real-world object
class Car {

    // Instance variables
    String name;
    String color;

    // Default constructor
    // Called automatically when object is created
    Car() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    // Used to initialize values at object creation
    Car(String name, String color) {
        this.name = name;   // current object's name
        this.color = color; // current object's color
    }

    // Method to calculate average speed
    float avg(float x, float y, float z) {
        float average = (x + y + z) / 3;
        System.out.println("Car average speed = " + average);
        return average;
    }

    // Copy constructor
    // Copies data from another Car object
    Car(Car c) {
        this.name = c.name;
        this.color = c.color;
    }
}

// Main class
public class basic_oops {

    public static void main(String[] args) {

        System.out.println("Basics of OOPS in Java\n");

        // Object creation using default constructor
        Car c1 = new Car();

        // Setting values using object reference
        c1.name = "Car1";
        c1.color = "Red";

        System.out.println(c1.name);
        System.out.println(c1.color);

        // Object creation using parameterized constructor
        Car c2 = new Car("Car2", "Green");

        System.out.println(c2.name);
        System.out.println(c2.color);

        // Object creation using copy constructor
        Car c3 = new Car(c2);

        System.out.println(c3.name);
        System.out.println(c3.color);

        // Calling method using objects
        float A = 100;
        float B = 200;
        float C = 300;

        c1.avg(A, B, C);
        c2.avg(40.55F, 65.00F, 8.52F);
    }
}
