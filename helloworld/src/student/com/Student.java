package student.com;

/**
 * Created by Yan on 2018/12/1.
 */
public class Student extends Object {

    private String name;
    private int score;

    public void setName(String nameString) {
        this.name = nameString;
    }
    public void setScore(int scoreValue) {
        this.score = scoreValue;
    }

    public String getName() {
       return this.name;
    }
    public int getScore() {
       return this.score;
    }

    public void study() {
        System.out.print("i am a student \n");
    }

    public void eat() {
        System.out.print("i am eat foods \n");
    }

    public Student(String name, int score) {
        this();
        this.name = name;
        this.score = score;
    }
    public Student() {
        super();
    }

}
