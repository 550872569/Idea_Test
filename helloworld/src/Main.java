
import helloworld.com.helloworld;
import helloworld.com.User;
import student.com.Student;
import Person.com.Child;

import Person.com.Person;
import Person.com.Father;

import Person.com.Child.OldBoy;
import Person.com.Child.BigBoy;

import Person.com.Test;

import FaceObjectB.IObjectE;
import FaceObjectB.ObjectA;
import FaceObjectB.ObjectB;
import FaceObjectB.ObjectC;
import FaceObjectB.ObjectD;

import student.com.Underfraduate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        helloworld.getUserName();

        User userYan = new User();
        System.out.print(userYan.getUserName());
        System.out.print(userYan.getUserAge());
        System.out.print(userYan.getUserSex());

        Student s = new Student("yanhangpu", 100);
        System.out.print("\n" +s.getName()+s.getScore());

        s.study();
        s.eat();

        Student student_a = new Student();
        student_a.setName("yanhangpu");
        student_a.setScore(99);

        System.out.print(student_a.getName());
        System.out.print(student_a.getScore());

        Father f = new Father();
        System.out.print(f.getName());

        System.out.print("\n");

        Child c = new Child();
        c.show();
        System.out.print("\n");

        Child.BigBoy b = new Child().new BigBoy();
        b.showBig();
        System.out.print("\n");

        Child.OldBoy o = new Child.OldBoy();
        o.showOld();

        Test t = new Test();
        t.show();
        objectShow();

        Student st = new Student("yan", 100);
        st.study();

        Underfraduate u = new Underfraduate(19,"ÿan","1");
        u.show();
    }

    public static void objectShow () {
        ObjectA a = new ObjectA();
        a.show();
        a.eat();
        ObjectD d = new ObjectD();
        d.showOld();
    }
}
