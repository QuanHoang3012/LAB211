
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static Scanner sc = new Scanner(System.in);

    public static double inputSize(String message) {
        System.setErr(System.out);
        double number = 0;
        while (true) {
            try {
                System.out.println(message);
                number = Double.parseDouble(sc.nextLine());
                if (number <= 0) {
                    System.err.println("must be greater than 0");
                    continue;
                } else if ((int) number != number) {
                    System.err.println("Not real number");
                    continue;
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("must be digit");
            }
        }
        return number;
    }

    public static int[] createInteger(double num) {
        Random rd = new Random();
        /// covert double variable to integer variable
        int number = (int) num;
        int[] a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = rd.nextInt(number);
        }
        return a;
    }

    public static void display(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }

        }
        System.out.print("]");
    }

    public static void bubblesort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double number = inputSize("Enter number of array:");
        System.out.print("Unsorter array: ");
        int[] array = createInteger(number);
        display(array);
        System.out.println();
        System.out.print("Sorted array: ");
        bubblesort(array);
        display(array);
    }

}
