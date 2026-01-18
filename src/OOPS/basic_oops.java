package OOPS; // Package name to organize classes

// User-defined class Car
class Car {

    int year;       // Year of car
    String model;   // Model name of car
    String color;   // Color of car

}

// User-defined class Pen
class Pen {

    String color;   // Color of pen
    String type;    // Type of pen

    // Method to show pen action
    void write() {
        System.out.println("Hello world in java user define class ");
    }

}

// Main class (program starts here)
public class basic_oops {

    public static void main(String[] args) {

        System.out.println("OOPS IN JAVA\n"); // Print heading

        // Creating first Car object
        Car c1 = new Car();
        c1.year = 2019;          // Set year
        c1.model = "Ford";       // Set model
        c1.color = "Red";        // Set color

        // Printing c1 details
        System.out.println(c1.year);
        System.out.println(c1.model);
        System.out.println(c1.color);

        System.out.println("-------------"); // Separator

        // Creating second Car object
        Car c2 = new Car();
        c2.year = 2018;          // Set year
        c2.model = "Ford";       // Set model
        c2.color = "Blue";       // Set color

        // Printing c2 details
        System.out.println(c2.year);
        System.out.println(c2.model);
        System.out.println(c2.color);

        System.out.println("Class :- Pen "); // Pen class output

        // Creating Pen object
        Pen p1 = new Pen();
        p1.color = "Black";      // Set pen color
        p1.type = "Ballpoint";   // Set pen type

        // Printing pen details
        System.out.println(p1.color);
        System.out.println(p1.type);

        // Calling pen method
        p1.write();
    }
}
