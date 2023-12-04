
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    List<Fruit> list = new ArrayList<Fruit>();
    Validation check = new Validation();
    public void menu(){
        System.out.println("1.	Create Fruit");
        System.out.println("2.	View orders");
        System.out.println("3.	Shopping (for buyer)");
        System.out.println("4.	Exit");
        System.out.println(" (Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to Exit program).");
    }
    public void createFruit(List<Fruit> list) {
        while (true) {
            System.out.print("Fruit ID: ");
            String fruitId = check.checkInputId(list);
            System.out.print("Fruit name: ");
            String fruitName = check.checkInputString("Fruit Name: ");
            System.out.print("Price: ");
            double price = check.checkDoubleLimit(0, fruitId);
            System.out.print("Quantity: ");
            int quantity = check.checkIntLimit(1,Integer.MAX_VALUE, "Quantity");
            System.out.print("Origin: ");
            String origin = check.checkInputString("Origin: ");
            list.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            String input = check.checkYN("Do you want to continue (Y/N)? User chooses Y to continues, if you chooses N, the program returns main screen and display all Fruits what are created.", "Y/N");
            if(input.equals("y")) continue;
            else if(input.equals("n")) break;
        }
    }
    public void displayListOfOrder(List<Fruit> list){
        int total =0;
         System.out.println("Product | Quantity | Price | Amount");
        for (Fruit f : list){
            System.out.printf();
            total+= f.getQuantity()*f.getPrice();
        }
        System.out.println("Total: "+total+"$");
    }
    public void displayListOfFruit(List<Fruit> list){
        int items =1;
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for(Fruit f : list){
            System.out.println("/t"+items+"/t"+f.getFruitName()+"/t"+f.getOrigin()+"/t"+f.getOrigin());
            items++;
        }
    }
    public void shopping(){
        
    }

}
