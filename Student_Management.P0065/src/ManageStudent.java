
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ManageStudent {

    private List<Student> list = new ArrayList<>();
    private Validate val = new Validate();

    public ManageStudent() {
    }

    public Student createStudent() {
        String name = val.iName();
        String studentClass = val.iString();
        double maths = val.iPoint("Maths");
        double chemistry = val.iPoint("Chemistry");
        double physical = val.iPoint("Physical");
        Student student = new Student(name, studentClass, maths, chemistry, physical);
        return student;
    }

    public void addStudent() {
        while (true) {
            list.add(createStudent());
            if (!val.iYN()) {
                break;
            }
        }
    }

    public void displayStudentInfo() {
        int i = 0;
        for (Student s : list) {
            System.out.println("---------Student " + (i + 1) + " Info -------");
            s.display();
            i++;
        }
    }

    //trả về một danh sách các đối tượng Student được lưu trong biến list.
    public List<Student> getList() {
        return this.list;
    }

    //Kết quả được trả về dưới dạng một HashMap, trong đó key là loại học sinh (A, B, C, D) và value là phần trăm tương ứng.
    public HashMap<String, Double> getpercentTypeStudent(List<Student> student) {
        HashMap<String, Double> averageStudent = new HashMap<>();
        int totalStudent = student.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        for (int i = 0; i < totalStudent; i++) {
            switch (student.get(i).getType()) {
                case 'A':
                    typeA++;
                    break;
                case 'B':
                    typeB++;
                    break;
                case 'C':
                    typeC++;
                    break;
                default:
                    typeD++;
                    break;
            }
        }
        averageStudent.put("A", typeA / totalStudent * 100);
        averageStudent.put("B", typeB / totalStudent * 100);
        averageStudent.put("C", typeC / totalStudent * 100);
        averageStudent.put("D", typeD / totalStudent * 100);
        return averageStudent;
    }

    public void displayClassificationInfo() {
        HashMap<String, Double> getPercent = getpercentTypeStudent(list);
        System.out.println("-------Classification Info----------");
        for (String type : getPercent.keySet()) {
            double percent = getPercent.get(type);
            System.out.printf("%s: %.2f%%\n",type, percent);
        }

    }

}
