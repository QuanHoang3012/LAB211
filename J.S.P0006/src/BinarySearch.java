
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    
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
           for(int i=0;i<number;i++){
               arr[i] = rd.nextInt(number);
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
       
       public static  int binarySearch(int []arr,int x){
           int l = 0;
           int r = arr.length-1;
           while(l<=r){
               int m= (l+r)/2;
               if(arr[m] == x)
                   return m;
               else if(arr[m] <x) 
                   l = m+1;
               else r = m-1;
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
           int m= binarySearch(a, value);
           System.out.println("Found "+value+" at "+m);
    }
}
