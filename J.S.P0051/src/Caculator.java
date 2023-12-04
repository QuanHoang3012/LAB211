/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Caculator {

    Validation check = new Validation();
    
      public int displayMenu(){
         System.out.println("========= Calculator Program =========");
         System.out.println("1. Normal Calculator");
         System.out.println("2. BMI Calculator");
         System.out.println("3. Exit");
         int choice = check.checkInputLimit("Please choice one option:", 1, 3);
         return choice;
     }
      public double inputNumber(String msg){
          double number = check.checkNumeric(msg);
          return number;
      }
    public void normalCaculator() {
        System.out.println("----- Normal Calculator -----");
        double number = inputNumber("Enter number: ");
        double result=number;
        while (true) {
            String operator = check.checkOperator("Enter Operator: ");
            double num2 =0;
            if(!operator.equals("=")){
                      num2 = inputNumber("Enter number 2:");
            }
                           
            switch (operator) {
                case"+" :  
                                    result +=  num2;
                                    System.out.println("Memory: "+result);
                                    break;
                case"-" :  
                                    result -= num2;
                                    System.out.println("Memory: "+result);
                                    break;    
                 case"*" :  
                                    result *= num2;
                                   System.out.println("Memory: "+result);
                                    break;
                  case"/" :     
                                    do{
                                        if(num2==0) {
                                            System.err.println("Can not be zero ");
                                            num2 = inputNumber("Enter number 2:");
                                        }
                                    }while(num2 ==0);
                                    result /= num2;
                                    System.out.println("Memory: "+result);
                                    break;
                  case "^" :
                                result = Math.pow(result,num2 );
                                System.out.println("Memory: "+result);
                                break;
                  case "=" : 
                      System.out.println("Memory: "+result);
                      return;
            }
            }
        }
    
    public void bmiCaculator(){
        System.out.println("----- BMI Calculator -----");
        double weight = check.checkNumeric("Enter Weight(kg):  ");
        double height = check.checkNumeric("Enter Height(cm): ");
        double bmi = weight / (height*height/10000);
        System.out.printf("BMI number: %.2f\n",bmi);
        if(bmi<19) System.out.println("Under-standard");
        else if(bmi <25) System.out.println("Standard");
        else if (bmi<30)  System.out.println("Overweight");
        else if(bmi <40) System.out.println("Fat - should lose weight ");
        else {
            System.out.println(" Very fat - should lose weight immediately");
        }  
        
    }
            
    }
