package student.com;

import student.com.Student;

/**
 * Created by Yan on 2018/12/2.
 */
public class Underfraduate extends Student {
    String degree;
    public Underfraduate(int age, String name, String degree) {
        this.degree  = degree;
    }
    public void show () {
        System.out.print(this.degree);
    }
}
