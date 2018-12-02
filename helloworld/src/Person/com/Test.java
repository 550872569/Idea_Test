package Person.com;
import Person.com.Father;
import Person.com.Father.Child;

/**
 * Created by Yan on 2018/12/1.
 */
public class Test {

    public static  void main(String[] args) {


    }

    public void show () {
        Father.Child c = new Father().new Child();
        c.introFather();
    }
}

