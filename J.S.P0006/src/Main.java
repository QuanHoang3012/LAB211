
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


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
     static Scanner sc = new Scanner(System.in);
    
       public static int checkInt(String object){
        while (true) {
            try {
                System.out.print(object );
                double semester = Double.parseDouble(sc.nextLine());
                if (semester <0) {
                    System.err.println( " must be greater than 0");
                } else if ((int) semester != semester){
                    System.err.println("Not real number");
                }
                else {
                    return (int) semester;
                }
            }  catch (NumberFormatException e2) {
                System.err.println( " must be digit");
            }
        }
    }
       
       public static int [] generate(int number){
           Random rd = new Random();
           int [] arr = new int[number];
           int max = number;
           int min = -number;
           for(int i=0;i<number;i++){
//               arr[i] =  ThreadLocalRandom.current().nextInt(-number,number);
                arr[i] =  (int) Math.floor(Math.random()*(max-min+1)+min);
           }
           return arr;
       }
       
       public static void display(int []arr){
           System.out.print("[");
           for(int i=0;i<arr.length;i++){
               if(i<arr.length-1)
               System.out.print(arr[i]+", ");
               else System.out.print(arr[i]+"]");
           }
           System.out.println();
       }
       
       public static void bubbleSort(int [] arr){
           for(int i=0;i<arr.length-1;i++){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[i]>arr[j]) {
                       int temp =arr[i];
                       arr[i] = arr[j];
                       arr[j] =temp;
                   }
               }
           }
           
       }
       public static int linearSearch (int[] arr , int x){
           for(int i=0;i<arr.length;i++) {
               if(arr[i] == x) return i;
           }
           return -1;
       }
       
        public static void main(String[] args) {
           int number = checkInt("Enter number of array: ");
           int value = checkInt("Enter search value: ");
           int []a = generate(number);
           display(a);
           bubbleSort(a);
           display(a);
           int m= linearSearch(a, value);
           System.out.println("Found "+value+" at "+m);
    }
       
}
