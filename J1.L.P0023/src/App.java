
import java.util.List;

public class App {

    Validation check = new Validation();
    BO m = new BO();

    public void test() {
        m.getStudent().add(new Student("HE186591", "HOANG QUAN", 1, "Java"));
        m.getStudent().add(new Student("HE186591", "HOANG QUAN", 7, ".Net"));
        m.getStudent().add(new Student("HE186594", "CAO TRANG", 5, ".Net"));
        m.getStudent().add(new Student("HE186595", "HOANG SON", 5, ".Net"));
        m.getStudent().add(new Student("HE186591", "HOANG QUAN", 6, "Java"));
        m.getStudent().add(new Student("HE186597", "LAM HOANG", 2, "C/C++"));
        m.getStudent().add(new Student("HE186598", "TRI TRUONG", 7, ".Net"));
        m.getStudent().add(new Student("HE186599", "HIEU HO", 2, "Java"));
        m.getStudent().add(new Student("HE146591", "HUY SON", 4, "C/C++"));
        m.getStudent().add(new Student("HE146591", "HUY SON", 5, "C/C++"));

    }

    public void createStudent() {
        int count = 0;
        while (true) {
            String iD = check.checkID();
            String name = check.checkName("Enter name: ");  
            int semester = check.checkInputLimit(1, 9, "Enter semester ");
            String course = check.checkCourse();
            if (m.addStudennt(iD, name, semester, course)) {
                System.out.println("sucess");
                count++;
                if (m.getStudent().size() >=10) {
                    String choice = check.checkYNAndUD("Enter Y/N", "y/n");
                    if (choice.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }
                }
            } else {
                System.err.println("Enter agian");
            }
        }

    }

    public void findAndSort() {
        String name = check.checkName("Enter name to search: ");
        List<Student> listStudentFindByName = m.sortByName(name);
        //////// Find student that have name be searched
        /// Sort students byt name
        System.out.printf("%-15s  | %-15s | %-15s\n", "Student name", "Semester", "Course Name");
        System.out.println("-----------------------------------------------------------");
        for (Student s : listStudentFindByName) {
            s.display();
        }
    }

    public void updateOrDelete() {
        if (m.getStudent().isEmpty()) {
            System.err.println("List is empty");
            return;
        } else {
            String iD = check.checkID();
            List<Student> listStudentFindByID = m.listStudentFindByID(iD);
            if (listStudentFindByID.isEmpty()) {
                System.err.println("List is empty");
                return;
            } else {
                ///// Print out
                System.out.printf("%-15s | %-15s  | %-15s | %-15s\n","count", "ID", "Student name", "Semester", "Course Name");
                System.out.println("-----------------------------------------------------------");
                int count = 0;
                for (Student s : listStudentFindByID) {
                    System.out.printf("%15d | %-15s | %-15s  | %-15s | %-15s\n", count, s.getiD(), s.getStudentName(), s.getSemester(), s.getCourseName());
                    count++;
                }
                ///////////////  Print out student have the ID we search

                String input = check.checkYNAndUD("Do you want to update (U) or delete (D) student. If user chooses U, the program allows user updating. Choose D for deleting student", "U/D");
                int choice = check.checkInputLimit(0, listStudentFindByID.size() - 1, "Choice: ");
                int indexStudent = m.indexOfStudent(iD, choice);
                switch (input) {
                    case "u":
                        while (true) {
                            String name = check.checkName("Enter name: ");
                            int semester = check.checkInputLimit(1, 9, "Enter semester: ");
                            String course = check.checkCourse();
                            if (m.checkStudentExist(iD, semester, course)) {
                                System.out.println("Duplicate");
                            } else {
                                if (!name.equalsIgnoreCase(listStudentFindByID.get(0).getStudentName())) {
                                    for (Student s : m.getStudent()) {
                                        if (s.getiD().equalsIgnoreCase(iD)) {
                                            s.setStudentName(name);
                                        }
                                    }
                                }
                                m.updateStudent(iD, name, semester, course, indexStudent);
                                System.err.println("Update Sucessfull");
                                     break;
                            }
                        }
                        break;
                    case "d":
                        m.getStudent().remove(indexStudent);
                        System.err.println("Delete Sucessfull");
                        break;
                }
            }
        }
    }

    public void reportStudent() {
        List<Student> report = m.report();
        System.out.printf("%-15s  | %-15s | %-15s\n", "Student name", "Course Name", "Total Course");
        for (Student s : report) {
            System.out.printf("%-15s  | %-15s | %-15s\n", s.getStudentName(), s.getCourseName(), s.getTotalCourse());
        }
    }

    public int menu1() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1.	Create");
        System.out.println("2.	Find and Sort");
        System.out.println("3.	Update/Delete");
        System.out.println("4.	Report");
        System.out.println("5.	Exit");
        System.out.println("Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program.");
        int choice = check.checkInputLimit(1, 5, "Choice: ");
        return choice;
    }

}
