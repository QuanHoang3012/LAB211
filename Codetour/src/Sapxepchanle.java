
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
public class Sapxepchanle {
    
    public static boolean check(int []a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
    
    public static int [] swap(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]%2==1 && a[j]%2==1) || (a[i]%2==0 && a[j]%2==0)  ){
                   if(a[j]<a[i])  
                  {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                   }    
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tstcase = sc.nextInt();

        int [] arr1 = new int[tstcase];

        
        for(int i=0;i<arr1.length;i++){
                    int arrlength = sc.nextInt();
                   int []arr2 = new int[arrlength];
                   for(int j=0;j<arr2.length;j++){
                       arr2[j] = sc.nextInt();
                   }
                   int []arr3= swap(arr2);
                   if(check(arr3)) System.out.println("YES");
                   else System.out.println("NO");
                   
        }
    }

}
