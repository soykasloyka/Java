import java.util.Scanner;

public class srednee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
        }
        System.out.println(sum / 5);
        scanner.close();
    }
}

