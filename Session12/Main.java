package Session12;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    public static void main(String args[]) {
// Create arrays of Integer, Double and Character
        Integer[] intArrayA = {1, 2, 3, 4, 5, 12 , 16 , 32};
        Integer[] intArrayB = {1, 2, 3, 4, 5, 55 , 36 , 47 , 65};

        System.out.println("جمع اعضای دو مقدار آرایه");
        printArray(intArrayA,intArrayB);

    }


    public static <E,F> void printArray(E[] inputArrayA, F[] inputArrayB) {
        int sum = 0;
        Integer[] intArrayC;
       if (inputArrayA.length > inputArrayB.length) {
           intArrayC=new Integer[inputArrayB.length];
           for (int i = 0; i < inputArrayB.length; i++) {
               intArrayC[i]=((Integer)inputArrayA[i])+((Integer)inputArrayB[i]);
           }
       }else{
           intArrayC=new Integer[inputArrayA.length];
           for (int i = 0; i < inputArrayA.length; i++) {
               intArrayC[i]=((Integer)inputArrayA[i])+((Integer)inputArrayB[i]);
           }
       }
        for (int i = 0; i < intArrayC.length; i++) {
            System.out.print(intArrayC[i]+ " ");
        }

    }
}