
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class App {
     BO bo = new BO();
     Validation val = new Validation();
     
     
     public void display(){
         System.out.println("====== Management Student Program ======");
         while(true){
              String name = val.checkInputName("Name: ");
        String className = val.checkInputName("Class: Name:");
        double math = val.checkInputMark("Maths");
        double physical = val.checkInputMark("Physics");
        double chemistry = val.checkInputMark("Chemistry");
        int index = bo.addStudent(name, className, math, physical, chemistry);
         if(val.checkYN().equalsIgnoreCase("N")){
            break;
        }
         }
         
         int index=1;
        for (Student st : bo.getStudent()) {
            System.out.println("------ Student "+index +" Info ------");
            st.display();
            index++;
        }
        
        HashMap<String, Double> hashMap = bo.getPercentTypeStudent();
        System.out.println(" --------Classification Info -----");
        for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " : " + value + "%");
        }
     }
     
     public void test() {
        bo.getStudent().add(new Student("nguyen van a", "fu1", 8, 10, 5));
        bo.getStudent().add(new Student("nguyen van b", "fu1", 9, 10, 5));
        bo.getStudent().add(new Student("nguyen van c", "fu1", 10, 7, 5));
        bo.getStudent().add(new Student("nguyen van d", "fu1", 5, 5, 5));
        bo.getStudent().add(new Student("nguyen van e", "fu1", 6, 10, 5));
    }
     
     
}
