
import java.util.ArrayList;
import java.util.HashMap;
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
public class BO {
    
    List<Student> list = new ArrayList<>();
    
    public int addStudent(String name,String className,  double math, double physical, double chemistry){
        list.add(new Student(name, className, math, physical, chemistry));
         int index =list.size();
        return index;
    }
    public HashMap<String, Double> getPercentTypeStudent () {
        HashMap<String,Double> hashmap = new HashMap<>();
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        for(Student o : list) {
            if(o.getAvg()>7.5) countA++;
            else if(o.getAvg()>=6) countB++;
            else if(o.getAvg()>=4) countC++;
            else countD++;
        }
        int totalStudent = list.size();
        hashmap.put("A", 100.0*countA/totalStudent);
        hashmap.put("B", 100.0*countB/totalStudent);
        hashmap.put("C", 100.0*countC/totalStudent);
        hashmap.put("D", 100.0*countD/totalStudent);
        return hashmap;
        
    }
    
    
    public List<Student> getStudent(){
        return list;
}
}
