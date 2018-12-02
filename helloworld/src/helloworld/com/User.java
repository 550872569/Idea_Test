package helloworld.com;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Created by Yan on 2018/12/1.
 */
public class User extends Object {
    String userName;
    int userAge;
    boolean userSex;



    public String getUserName(){
        System.out.print("yanhangpu\n");
        return "燕航谱";
    }
    public int getUserAge() {
        System.out.print(18);
        System.out.print("\n");
        return 18;
    }
    public boolean getUserSex() {
        System.out.print(true);
        return true;
    }
}
