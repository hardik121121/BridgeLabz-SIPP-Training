/*Vehicle Rental Application Scenario:
Build a system for renting bikes, cars, and trucks to customers.

Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer (Scenario-based problems)
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

OOP Concepts:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

//Interface 
interface Rentable {
    double calculateRent(int days);
}

//Abstract class for Vehicle

abstract class Vehicle implements Rentable {
    protected String vehicleId;
    protected String brand;
    protected double baseRate;
    
    //Consturtor method 
    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    
    // getter method
    public String getVehicleId() {
        return vehicleId;
    }


   //Setter Method
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }


   //Getter Method
    public String getBrand() {
        return brand;
    }


    //Setter method
    public void setBrand(String brand) {
        this.brand = brand;
    }


    //Getter Method
    public double getBaseRate() {
        return baseRate;
    }


   //Setter Method
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
}


// There is a abstract class vehical and car is extending that class 
class Bike extends Vehicle {
   // private boolean hasHelmet;
    private boolean hasHelmet = true;
    // Construtor
    public Bike(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
     //   this.hasHelmet = hasHelmet;
    }

   // public boolean isHasHelmet() {
     //   return hasHelmet;
  //  }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
    //    if (!hasHelmet) {
            rent += 5 * days; 
      //  }
        return rent;
    }
}

class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String vehicleId, String brand, double baseRate, boolean hasAirConditioning) {
        super(vehicleId, brand, baseRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        if (hasAirConditioning) {
            rent += 10 * days; 
        }
        return rent;
    }
}

class Truck extends Vehicle {
    private double loadCapacity; 

    public Truck(String vehicleId, String brand, double baseRate, double loadCapacity) {
        super(vehicleId, brand, baseRate);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        rent += loadCapacity * 20 * days; 
        return rent;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class VehicleRentalApplication {
    public static void main(String[] args) {
        Bike bike = new Bike("01", "Yamaha", 15);
        Car car = new Car("02", "Toyota", 50, true);
        Truck truck = new Truck("03", "Volvo", 100, 5);

        Customer customer = new Customer("001", "Vinayak");

        int rentalDays = 3;
        System.out.println("Customer: " + customer.getName());
        System.out.println("Bike Rent for " + rentalDays + " days: " + bike.calculateRent(rentalDays));
        System.out.println("Car Rent for " + rentalDays + " days: " + car.calculateRent(rentalDays));
        System.out.println("Truck Rent for " + rentalDays + " days: " + truck.calculateRent(rentalDays));
    }
}
