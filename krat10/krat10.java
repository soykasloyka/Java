import java.util.Scanner;

public class krat10 {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);

        int i;
        do {
            i = bombInterface.nextInt();
            System.out.println(i);
        } while (i % 10 != 0);
    }
}
