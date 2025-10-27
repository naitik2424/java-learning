import java.util.Random;


public class RandomExample {
    public static void main(String[] args){

        Random random = new Random();

        int number;
        double number1;
        boolean isHead;
 
        number = random.nextInt(1,7);
        System.out.println("Random number between 1 to 6: " + number);

        number1 = random.nextDouble(1,7);
        System.out.println("Random number between 1.0 to 6.0: " + number1);

        isHead = random.nextBoolean();
        if(isHead){
            System.out.println("It's Heads");
        }
        else{
            System.out.println("It's Tails");
        }

    }
    
}
