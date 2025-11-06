public class Array {
    String model;
    String color;

    Array(String model, String color){
        this.model = model;
        this.color = color;
    }
    void drive (){
        System.out.println("You drive the  " + this.color + " " + this.model);
    }
    public static void main(String[] args) {
        Array car1  = new Array("Mustang", "Red");
        Array car2 = new Array("Civic", "Blue");
        Array car3 = new Array("Tesla", "White");
        
        // Car[] cars = new Car[3];
        Array[] cars = {car1, car2, car3};
        // for(int i = 0;i < cars.length; i++){
        for(Array c : cars){
            c.drive();

        }
    }


}
