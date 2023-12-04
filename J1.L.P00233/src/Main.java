
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Fruit>  list = new ArrayList<>();
        Validation check = new Validation();
        Manager m = new Manager();
        m.menu();
        System.out.print("Choice: ");
        int choice = check.checkIntLimit(1,5, "Choice: ");
        while (true) {            
             switch(choice){
                 case 1: m.createFruit(list);
                 m.displayListOfFruit(list);
                 break;
                 case 2: 
        }
        }
        
    }
}
