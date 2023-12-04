/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Student {
    private String studentID;
    private String name ;

    public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public void display(){
        System.out.println(this.studentID+" "+this.name);
    }
}
