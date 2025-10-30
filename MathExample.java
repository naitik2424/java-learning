import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        double result;
        result = Math.pow(2, 3);
        System.out.println(result);

        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a:");
        
        a = scanner.nextDouble();

        System.out.println("Enter side b:");
        b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
        

        scanner.close();
    }

    
}

