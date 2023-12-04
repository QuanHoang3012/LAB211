
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
public class App {
     BO bo = new BO();
    Validation check = new Validation();
    
     public int menu(){
         System.out.println("========= Task program =========");
         System.out.println("1.	Add Task");
         System.out.println("2.	Delete task");
         System.out.println("3.	Display Task");
         System.out.println("4.	Exit");
         int choice = check.checkInputLimit(1, 4, "Enter choice: ");
         return choice;
     }
     
     public void addTask(){
         System.out.println("------------Add Task---------------");
         String name = check.checkInputString("Requirement Name: ");
         int type = check.checkInputLimit(1, 4, "Task Type: ");
         String taskType = check.checkTaskType(type);
         String date = check.checkDate("Date: ");
         double planFrom=0;
         double planTo=0;
         do{
              planFrom = check.checkPlan("From: ");
         }while(planFrom>=17.5);
         while (true) {             
             planTo = check.checkPlan("To: ");
             if(planFrom>= planTo ) {
                 System.out.println("Re-Input");
             }else break;
         }
         String assign = check.checkInputString("Assignee: ");
         String reviewer = check.checkInputString("Reviewer: ");
        if( bo.addTask(name, assign, reviewer, taskType, date, planFrom, planTo)== 0) {
            System.out.println("Duplicate");
        }else {
            System.out.println("Add success");
        }
        
         
     }
     
     public void displayTask(){
         System.out.println("----------------------------------------- Task ---------------------------------------");
         System.out.printf("%-5s  %-15s  %-15s %-15s  %-15s  %-15s  %-15s  \n", "ID", "Name", "Task Type","Date","Time","Assignee","Reviewer");
         for(Task t :  bo.getDataTasks()){
             double time = t.getPlanTo()-t.getPlanFrom();
             System.out.printf("%5d  %-15s  %-15s %-15s  %-15.1f  %-15s  %-15s  \n",t.getID(),t.getName(),t.getTaskTypeID(),t.getDate(),time,t.getAssign(),t.getReviewer());
         }
     }
     
     public void deleteTask(){
            int id = check.checkInputLimit(1, bo.getDataTasks().size(), "Enter Id to search: ");
            if(bo.deleteTask(id)==null) {
                System.err.println("List is not found");
            }
            else {
                System.err.println("Delete sucess");
            }
     }
     
}
