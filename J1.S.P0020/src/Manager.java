
import java.util.Scanner;
import javax.xml.transform.Source;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Manager {
   private static Scanner sc = new Scanner(System.in);
    public static int checkValue(String message){
        int numbers=0;
         while(true){
    try {
             numbers= Integer.parseInt(sc.nextLine());
             return numbers;
        } catch (Exception e) {
            System.out.println("Invalid number, try again");
            System.out.println(message);
        }
            
    }
    }
    public int inputSizeOfArray(String message){
        System.out.println(message);
        int numbers= checkValue(message);
        return numbers;
    }
    public int [] inputValueOfArray(int numbers) {
        int []array = new int[numbers];
        for (int i=0;i<array.length;i++) {
            System.out.print("a["+(i+1)+"]= ");
            array[i] = checkValue("Enter again a["+(i+1)+"]= ");
        }
        return array;
    }
    public void display(int []a) {
        System.out.print("[");
        for (int i=0;i<a.length;i++) {
            if (i< a.length-1) System.out.print(a[i]+", ");
            else System.out.println(a[i]+"]");
        }
    }
    public void sellectionSort(int []a) {
        for(int i=0;i<a.length-1;i++) {
            int min_index=i;
            for (int j=i+1;j<a.length;j++) {
                if (a[j]<a[min_index]) min_index=j;
                int temp=a[i];
                a[i]= a[min_index];
                a[min_index] = temp;
            }
        }
    }
    
    
}
