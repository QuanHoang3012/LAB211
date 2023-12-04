
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BO {
    List<Student> list  = new ArrayList<>();
    Validation check = new Validation();
        List<Student> report = new ArrayList<>();

    public List<Student> listStudentFindByName(String name) {
        List<Student> listStudentFindByName = new ArrayList<>();
        for (Student s : list) {
            if (s.getStudentName().contains(name)) {
                listStudentFindByName.add(s);
            }
        }
        return listStudentFindByName;
    }
    
    
    public boolean addStudennt(String iD, String name, int semester, String course){
        List<Student> listStudentFindByID = listStudentFindByID(iD);
        if(listStudentFindByID.size()>0) {
            if(!listStudentFindByID.get(0).getStudentName().equalsIgnoreCase(name)) {
                return false;
            }
            for(Student s : listStudentFindByID){
                if(course.equalsIgnoreCase(s.getCourseName()) && semester == s.getSemester()) 
                    return false;
            }
        }
        list.add(new Student(iD, name, semester, course));
        return true;
    }
    
    public List<Student> sortByName( String name) {
        List<Student>   listStudentFindByName =  listStudentFindByName(name);
        Collections.sort( listStudentFindByName , new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        return listStudentFindByName;
    }

    public void updateStudent(String iD, String name, int semester, String courseName,int indexStudent) {
            list.get(indexStudent).setCourseName(courseName);
            list.get(indexStudent).setSemester(semester);
            list.get(indexStudent).setStudentName(name);
            list.get(indexStudent).setiD(iD);
    }

    public List<Student> listStudentFindByID(String iD) {
        List<Student> listStudentFindByID = new ArrayList<>();
        for (Student s : list) {
            if (iD.equalsIgnoreCase(s.getiD())) {
                listStudentFindByID.add(s);
            }
        }
        return listStudentFindByID;
    }

    public List<Student> report() {
        report.clear();
      for (int i = 0; i < list.size(); i++) {
         int total = 0;
         for (int j = 0; j < list.size(); j++) {
                if (list.get(i).getiD().equalsIgnoreCase(list.get(j).getiD()) && list.get(i).getCourseName().equals(list.get(j).getCourseName())) {
                    total++;
                }
            }
          if(!checkReportExist(list.get(i).getStudentName(), list.get(i).getCourseName(), total))  
         report.add(new Student(list.get(i).getStudentName(),list.get(i).getCourseName(),total));
        }
       return report;
    }
    
    public int indexOfStudent(String iD,int choice){
        int count =0;
                for (int i = 0; i < list.size(); i++) {
                        if(listStudentFindByID(iD).size()>0 && listStudentFindByID(iD).get(0).getiD().equalsIgnoreCase(list.get(i).getiD()) ) {
                            if(choice == count ) return i;
                            count ++;
                        }
                        else  if (listStudentFindByID(iD).get(0).getiD().equalsIgnoreCase(list.get(i).getiD())) {
                         return i;
                }
    }
                        return -1;
    }
    
    public List<Student> getStudent(){
        return list;
    }
    
    public boolean checkStudentExist(String id,  int semester, String courseName) {
        for (Student student : list) {
            if (id.equalsIgnoreCase(student.getiD())
                    && (semester == student.getSemester())
                    &&( courseName.equalsIgnoreCase(student.getCourseName()))) {
                return true;
            }
        }
        return false;
    }
    
    
     public boolean checkReportExist(String name, String course, int total){
         for(Student s : report) {
             if(s.getStudentName().equalsIgnoreCase(name) && s.getCourseName().equalsIgnoreCase(course) && s.getTotalCourse()==total) 
                 return true;
         }
         return false;
     }
}
