public class Car {
    // Attributes of the car
    private String make;
    private String model;
    private int year;
    private double speed;

    // Constructor to initialize a car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0; // Initial speed is 0
    }

    // Method to accelerate the car
    public void accelerate(double increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("The car accelerates by " + increment + " km/h. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Invalid acceleration value.");
        }
    }

    // Method to brake the car
    public void brake(double decrement) {
        if (decrement > 0) {
            speed -= decrement;
            if (speed < 0) {
                speed = 0;
            }
            System.out.println("The car decelerates by " + decrement + " km/h. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Invalid brake value.");
        }
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Display car details
        myCar.displayDetails();

        // Accelerate the car
        myCar.accelerate(30);

        // Brake the car
        myCar.brake(10);

        // Display car details again
        myCar.displayDetails();
    }
}
