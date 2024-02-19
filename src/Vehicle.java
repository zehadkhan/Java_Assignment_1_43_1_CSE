
class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving vehicle.");
    }
}

// Derived classes
class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    public void park() {
        System.out.println("Parking car.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    public void performWheelie() {
        System.out.println("Performing a wheelie.");
    }
}

class ElectricVehicle extends Vehicle {
    protected int batteryCapacity;

    public ElectricVehicle(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Electric vehicle.");
    }
}