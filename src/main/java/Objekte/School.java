package Objekte;

import java.util.ArrayList;
import java.util.List;

public class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String toString() {
        return students.toString();
    }
    public void idFinder(School students, int num){

        for (Student  person : students.students)
            if (person.getNum() == num)
                System.out.println(person);

        else{
                System.out.println("not found");
            }
        }

    public void removeStudent(Student student) {
        students.remove(student);
    }}
