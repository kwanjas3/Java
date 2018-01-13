import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guesses = 10;
        int number = (int) (Math.random() * 100 + 1);
        System.out.println("you have" + guesses + " to guess a number between 1-100\n");
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Guess#" + (i + 1) + " Enter your integer: ");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Good Job");
                break;
            }
            if (guess > number) {
                System.out.println("Your guess is larger");
            }
            if (guess < number) {
                System.out.println("Your guess is smaller");
            }
        }

    }
}
