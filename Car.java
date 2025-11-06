 // Object = An entity that holds data (attributes)
        //   and can perform actions (methods)
        //   It is a reference data type

public class Car{

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 500000;
    boolean isRunning = false;
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    public static void main(String[] args) {
        
        Car car = new Car();
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
    //     System.out.println("Car Make: " + car.make);
    //     System.out.println("Car Model: " + car.model);
    //     System.out.println("Car Year: " + car.year);
    //     System.out.println("Car Price: " + car.price);
    //     System.out.println("Is Car Running?: " + car.isRunning);
    }

}
