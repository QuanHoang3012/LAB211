
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
             String result = sc.nextLine().trim();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date date = format.parse(result);
            System.out.println(format.format(date));
        } catch (Exception e) {
        }
        
    }
            
}
