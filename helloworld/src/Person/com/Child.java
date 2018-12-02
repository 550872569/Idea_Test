package Person.com;

import Person.com.Father;

/**
 * Created by Yan on 2018/12/1.
 */
public class Child extends Father {

    static int height;
    int age;
    //1. 成员内部类
    //2. 静态内部类
    //3. 方法内部类

    public void show() {
        class LitleBoy {
            void  showLitle() {
                System.out.printf("Hello LitleBoy!");
                System.out.printf("Hello LitleBoy!"+age);
            }
        }
        LitleBoy lb = new LitleBoy();
        lb.showLitle();
    }

    public class BigBoy {
        public void showBig () {
            System.out.print("BigBoy");
        }
    }
    public   static  class OldBoy {
        public void showOld () {
            System.out.print("showOld");
            System.out.printf("Hello LitleBoy!"+height);
        }
    }
}
