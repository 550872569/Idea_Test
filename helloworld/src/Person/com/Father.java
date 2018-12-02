package Person.com;

import Person.com.Person;
/**
 * Created by Yan on 2018/12/1.
 */
public class Father extends Person {

    private String name;
    public String getName() {
        return "zhangjun";
    }
    class Child {
        public void introFather() {
            System.out.print(name);
        }
    }
}
