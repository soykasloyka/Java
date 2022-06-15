import java.util.Random;
import java.util.Scanner;

public class big1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Программа завершена. Введенное число должно быть больше 0.");
            return;
        }

        for (int i = 1; true; i++) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Попытка №" + i);
                break;
            }
        }
    }
}
