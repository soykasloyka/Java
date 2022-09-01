import java.util.Random;
import java.util.Scanner;

public class big1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("The program has ended. The number entered must be greater than 0.");
            return;
        }

        for (int i = 1; true; i++) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Attempt No. " + i);
                break;
            }
        }
    }
}
