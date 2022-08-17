public class rand {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return  (int) (Math.random() * 100);
    }
}
