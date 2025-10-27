import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        age = scanner.nextInt();

        if (age>65){
            System.out.println("you are a senior");
        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age < 0){
            System.out.println("you are not even born yet");
        }
        else if(age == 0){
            System.out.println("you are just born baby");
        }
        else{
            System.out.println("you are a minor");
        }

        scanner.close();
    }
	
}
