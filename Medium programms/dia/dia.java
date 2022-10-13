
import java.util.Scanner;
public class dia {
    public static String getFirstPositionPhrase = "Help Amigo to find where Diablo is hiding? Enter position number (1, 2, 3 or 4):";
    public static String getPositionPhrase = "The Diablo not found. Let's try again. Enter position number (1, 2, 3 or 4):";
    public static String findDiabloPhrase = "Amigo found the Diablo.";
    public static String diabloDefendPhrase = "Amigo attacks. The Diablo repelled Amigo's attack and retaliated.";
    public static String amigoAttackPhrase = "Amigo's strike hit the target. The Diablo lost 3 life.";
    public static String winPhrase = "Amigo defeated the Diablo and knocked out a mysterious crystal from his head.";
    public static String loosePhrase = "Diablo defeated Amigo.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);

        findDiablo();

        battle();

        if (isAmigoWin()) {
            System.out.println(winPhrase);
        } else {
            System.out.println(loosePhrase);
        }
    }

    public static void findDiablo() {
        Scanner scanner = new Scanner(System.in);
            System.out.println(getFirstPositionPhrase);
            while (true) {
                int position = scanner.nextInt();
                if (position == diabloPosition) {
                    System.out.println(findDiabloPhrase);
                    break;
                } else {
                    System.out.println(getPositionPhrase);
                }
                scanner.close();
            }
        }
    

    public static void amigoLostLife() {
        amigoLives--;
    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloDefends() {
        return getRandomNumber(3);
    }

    public static void battle() {
        while (diabloLives > 0 && amigoLives > 0) {
            if (amigoAttacks() == diabloDefends()) {
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            } else {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            }
        }
    }

    public static boolean isAmigoWin() {
        return diabloLives == 0;
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
