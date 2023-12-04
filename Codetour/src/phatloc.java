
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
public class phatloc {

    public static int [] henhiphan(long  M) {
         int[] A = new int[1000];
        int L = 0;
        while (M > 0) {
            L++;
            A[L] = (int) (M % 2);
            M /= 2;
        }
        return A;
    }
    
    public static void inra(String st) {
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == '0') {
                System.out.print(6);
            } else {
                System.out.print(8);
            }
        }
        System.out.println();
    }
    
    public static void xuly(int []A) {
        int L = A.length;
        int du = 1;
        String st = "";
        
        for (int i = 1; i < L; i++) {
            switch (A[i] + du) {
                case 1:
                    st = "1" + st;
                    du = 0;
                    break;
                case 0:
                    st = "0" + st;
                    du = 0;
                    break;
                case 2:
                    st = "0" + st;
                    du = 1;
                    break;
                default:
                    break;
            }
        }
        
        if (du != 0) {
            st = "0" + st;
        }
        
        inra(st);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int k = sc.nextInt();
           int []a= henhiphan(k);
            xuly(a);

                
    }
}

