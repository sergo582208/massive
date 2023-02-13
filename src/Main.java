import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task4() {
        int[] numbers = {1, 2, 3};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (numbers[i]%2 != 0);
            numbers[i] += 1;

        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void task1() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers1 = {1.57, 7.654, 9.986};

        short[] numbers2 = {123, 76, 99, 57, 74};

    }

    public static void task2() {
        int[] numbers = {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        short[] numbers2 = {123, 76, 99, 57, 74};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i != numbers1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] numbers = {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        short[] numbers2 = {123, 76, 99, 57, 74};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
                }
            }
            System.out.println();

        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i != 0) {
                System.out.print(", ");
                    }
                }
                System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i != 0) {
                System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            }


