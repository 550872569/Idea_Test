package FaceObjectB;
import FaceObjectB.ObjectC;

/**
 * Created by Yan on 2018/12/2.
 */
public class ObjectD extends ObjectC {
    @Override
    public void showOld() {
        super.showOld();
        System.out.print("ObjectD showOld");
    }
}
