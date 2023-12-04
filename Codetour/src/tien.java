

import java.util.ArrayList;
import java.util.List;
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
public class tien {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int doDai = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        String tien = sc.nextLine();
        for(int i=0;i<doDai;i++){
            list.add(tien.charAt(i)+"");
        }
         if(doDai==0) {
             list.add(d+"");
             System.out.println(list.get(0));
             return;
         }
    int index = 0;
    String max = list.get(doDai-1);
        for(int i=doDai-1;i>=0;i--){
             if(max.compareTo(list.get(i))<0) {
                 max = list.get(i);
                 index = i;
             }
        }
        list.add(index+1,d+"");
       for(int i=0;i<=doDai;i++){
           System.out.print(list.get(i));
       }
    }
}
