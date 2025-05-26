public class Car {
    
    String make;
    String model;
    int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Tesla", "Model 3", 2023);
        car1.displayDetails();
        car2.displayDetails();
    }
}

