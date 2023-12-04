
import javafx.scene.input.Mnemonic;

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
        Manager m = new Manager();
        int numbers = m.inputSizeOfArray("Enter numbers of array:");
        int []a = m.inputValueOfArray(numbers);
        System.out.print("Unsorted array:");
        m.display(a);
        System.out.println();
        System.out.print("Sorted array:");
        m.sellectionSort(a);
        m.display(a);
               
    }
}
