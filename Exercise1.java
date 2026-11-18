class Vehicle{ 
    private final String brand;
    private final int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        System.out.println("The " + year + " " + brand + " starts.");
    }
}

class Car extends Vehicle {
    private final int num_doors;
    public Car(String brand, int year, int num_doors) {
        super(brand, year);
        this.num_doors = num_doors;
    }
    public void honk(){
        System.out.println("The car with " + num_doors + " doors honks. Siuuuu!");
    }
}
public class Exercise1 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Honda", 2015);
        Car car = new Car("Toyota", 2020, 4);
    
        vehicle.start();
        car.start();
        car.honk();
    }
}
