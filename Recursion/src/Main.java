/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Main {

    public static void star(int n) {
        if (n == 0) {
            System.out.print("*");
        } else {
            System.out.print("*");
            star(n - 1);

        }

    }
    public static int inSo(int n){
        if(n==1) return 0;
        else {
            return n/2;
        }
    }
    public static void soX2(int n){
        if(n>=1){
            if(inSo(n)==1) System.out.print(0);
            soX2(n/2);
            System.out.print(inSo(n)+" ");
        }
    }

    public static void pyramid(int n) {
        if (n >= 0) {
            pyramid(n-1);
            System.out.println();
            star(n);
        }
    }

    public static void main(String[] args) {
        soX2(32);
    }
}
