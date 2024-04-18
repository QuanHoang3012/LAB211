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
    private String iD;
    private String studentName;
    private int semester;
    private String courseName;
    private int totalCourse;
    public Student() {
    }

    public Student(String studentName, String courseName, int totalCourse) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.totalCourse = totalCourse;
    }
    
    public Student(String iD, String studentName, int semester, String courseName) {
        this.iD = iD;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getTotalCourse() {
        return totalCourse;
    }
    

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void display() {
        System.out.printf("%-15s | %-15s | %-15s\n", studentName, semester, courseName);
    }
}
