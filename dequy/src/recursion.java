
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class recursion {
      private static long[] f = new long[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
                f(n);
        System.out.println("The 45 sequence fibonacci");
        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        System.out.println(f(44));
    }

    private static long f(int n) {
        if (n < 2) {
            f[n] = n;
            return n;
        } else if (f[n] != 0) {
            return f[n];
        } else {
            f[n] = f(n - 1) + f(n - 2);
            return f[n];
        }
    }
}
