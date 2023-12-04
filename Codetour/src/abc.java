
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
public class abc {
  
    public static boolean checkABC(String dong){
        char[] str = dong.toCharArray();
           if(str[0]=='a') return true;
           else if(str[1]=='a') {
               if(str[0] > str[2]) return false;
               return true;
           }
           else if(str[2]=='a') {
               if(str[0]>str[1]) return true;
               return false;
           }
           return true;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           int test = sc.nextInt();
           String []nhap = new String[test];
          
           for(int i=0; i<nhap.length; i++){
               nhap[i] = sc.next();
           }
           for(int i=0;i<test;i++){
               if(checkABC(nhap[i])) System.out.println("YES");
               else System.out.println("NO");
           }

    }
}
