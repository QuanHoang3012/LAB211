
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
public class BO {
     
    
    List<Task> list = new ArrayList<>();
    public boolean isPersonBusy(String assign,String date, double planFrom, double planTo){
        for(Task t : list){
            if(t.getAssign().equalsIgnoreCase(assign) && t.getDate().equalsIgnoreCase(date)) {
                if((planFrom >= t.getPlanFrom() && planTo<= t.getPlanTo()) || (planFrom <= t.getPlanFrom() && planTo>= t.getPlanTo() ) || (planTo >= t.getPlanTo() && planFrom>= planFrom) || (planFrom<=t.getPlanFrom() && planTo>= t.getPlanFrom()) )
                    return true;
            }
        }
        return false;
    }
    public int addTask(String name, String assign, String reviewer,  String  taskTypeID, String date, double planFrom, double planTo){
        int id =1;
        if(!list.isEmpty()) 
            id = list.get(list.size()-1).getID()+1;
        if(isPersonBusy(assign, date, planFrom, planTo))
            return 0;
        list.add(new Task(id, taskTypeID, name, date, planFrom, planTo, assign, reviewer));
        return id;
    }
    
    public int findTaskID(int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getID()== id) return i;
        }
        return -1;
    }
    
    public List<Task> deleteTask (int id){
        if(list.isEmpty()) return null;
        int idFInd = findTaskID(id);
        if(idFInd != -1) {
            list.remove(idFInd);
            for(int i=idFInd;i<list.size();i++){
                list.get(i).setID(list.get(i).getID()-1);
            }
        } 
        return list;
    }
    
    public List<Task> getDataTasks(){
        return list;
    }
}
