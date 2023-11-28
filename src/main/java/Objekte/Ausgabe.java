package Objekte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ausgabe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welche nummer");
        int num = sc.nextInt();
        Student student1 = new Student();
        student1.setName("Lisa1");
        student1.setLastName("meow1");
        student1.setNum(1);

        Student student2 = new Student();
        student2.setName("Lisa2");
        student2.setLastName("meow2");
        student2.setNum(2);

        Student student3 = new Student();
        student3.setName("Lisa3");
        student3.setLastName("meow3");
        student3.setNum(3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Student student4 = new Student();
        student4.setName("Lisa4");
        student4.setLastName("meow4");
        student4.setNum(4);

        School bbzbl = new School();
        bbzbl.addStudent(student4);
        bbzbl.addStudent(student2);
        bbzbl.addStudent(student3);
        bbzbl.addStudent(student1);
        bbzbl.idFinder(bbzbl, num);
        System.out.println(bbzbl);
        bbzbl.removeStudent(student2);
        System.out.println(bbzbl);
    }
}
