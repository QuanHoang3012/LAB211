/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

/**
 *
 * @author Anh Quan
 */
public class MyStack {

    private int capacity;
    private Student[] students = new Student[capacity];
    private int size;
    private int top;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.top = -1;
        this.students = new Student[capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size() {
        return this.size;
    }

    public void push(Student s) {
        if (this.size > this.capacity) {
            return;
        }
        students[this.size()] = s;
        this.size++;
        this.top += 2;
    }

    public Student pop() {
        if (this.size == 0) {
            return null;
        }
        Student s = students[this.size];
        students[top] = null;
        this.size--;
        this.top--;
        return s;
    }

    public Student peek() {
        if (this.size == 0) {
            return null;
        }
        return students[this.size - 1];
    }

    public void clear() {
        students = null;
    }

    public void traverse() {
        for (int i = this.size - 1; i >= 0; i--) {
            students[i].display();

        }
    }
}
