package Session14;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {
    public static void main(String args[]) {
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List l2 = new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        System.out.println("مقایسه دو لیست");
        compare(l1, l2);


    }


    public static <E, F> void compare(List<E> l1, List<F> l2) {


        if (l1.size() == l2.size()) {
            for (int i = 0; i < l2.size(); i++) {
                if (l2.get(i) == l1.get(i)) {
                    System.out.println("مقادیر خانه "+ i +" برابر هستند" );
                } else {
                    System.out.println("مقادیر خانه "+ i +" برابر نیستند" );
                }
            }
        }
    }

}

