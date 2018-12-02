package FaceObjectB;

import FaceObjectB.IObjectE;

/**
 * Created by Yan on 2018/12/2.
 */
public class ObjectA implements IObjectE {
    @Override
    public void show() {
        System.out.print("ObjectA show");
    }

    @Override
    public void eat() {
        System.out.print("ObjectA eat");
    }
}
