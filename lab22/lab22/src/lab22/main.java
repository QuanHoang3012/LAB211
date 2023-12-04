/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        Manager m = new Manager();
        ArrayList<Candidate> candidates = new ArrayList<>();
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                    + "1.	Experience\n"
                    + "2.	Fresher\n"
                    + "3.	Internship\n"
                    + "4.	Searching\n"
                    + "5.	Exit");
            
            int choice = v.checkInputIntLimit("Enter your choice: ", 1, 5);
            switch (choice) {
                
                case 1:
                    //m.creatStudent();
                    m.createCandidate(0);
                    break;
                case 2:
                    m.createCandidate(1);
                    break;
                case 3:
                    m.createCandidate(2);
                    break;
                case 4:
                    m.searching();
                    break;
                case 5:
                    return;
            }
        }
    }

}
