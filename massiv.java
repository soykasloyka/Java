public class Solution1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
    }
}

public class Solution2 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = EVEN;
        strings[1] = ODD;
        strings[2] = EVEN;
        strings[3] = ODD;
        strings[4] = EVEN;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}

public class Solution3 {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        if (array[0] % 2 == 0) {
            array[0] = -array[0];
        }
        if (array[1] % 2 == 0) {
            array[1] = -array[1];
        }
        if (array[2] % 2 == 0) {
            array[2] = -array[2];
        }
        if (array[3] % 2 == 0) {
            array[3] = -array[3];
        }
        if (array[4] % 2 == 0) {
            array[4] = -array[4];
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}

public class Solution4 {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] % 2 != 0) {
                x += coordinates[i];
            } else {
                y += coordinates[i];
            }
        }
        System.out.println("(" + x + ";" + y + ")");
    }
}

public class Solution5 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}

public class Solution6 {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < 100; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }
    }
}

public class Solution7 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}

public class Solution8 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}

public class Solution9 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
}
