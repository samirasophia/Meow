package Objekte;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    String lastName;
    int Num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public void addStudent(Student a){
        List<Student> studentList = new ArrayList<>();
        studentList.add(a);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
