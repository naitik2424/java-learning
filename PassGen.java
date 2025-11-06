import java.util.Random;

public class PassGen {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        number1 = random.nextInt(0, 9);

        String uppercaseLetters;
        uppercaseLetters = String.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(26)));

        String lowercaseLetters;
        lowercaseLetters = String.valueOf("abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26)));

        String specialCharacters;
        specialCharacters = String.valueOf("!@#$%^&*()-+<>?".charAt(random.nextInt(14)));
        System.out.println("Generated Password: " + uppercaseLetters + lowercaseLetters + specialCharacters + number1);

    }
}
