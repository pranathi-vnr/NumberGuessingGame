import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int computerNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Welcome! Try to guess the number between 1 and 100. Type '-1' to quit.");
            
            int num;
            while (true) {
                System.out.print("Enter your guess: ");
                num = in.nextInt();

                if (num == -1) {
                    System.out.println("The correct number was: " + computerNumber);
                    break;
                }

                if (num == computerNumber) {
                    System.out.println("Congratulations! You guessed the right number.");
                    break;
                } else if (num > computerNumber) {
                    System.out.println("Too high! Try guessing a smaller number.");
                } else {
                    System.out.println("Too low! Try guessing a bigger number.");
                }
            }
        }
    }
}
