package Session13;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("D:\\test.txt");
//        System.out.println(fileInputStream.read());

//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\test.txt");
//        fileOutputStream.write(99);
        File file = new File("D:\\simin.txt");
        file.createNewFile();
        File file2 = new File("D:\\simin2.txt");
        file2.createNewFile();

        FileOutputStream fileOutputStream2 = new FileOutputStream("D:\\simin.txt");
        fileOutputStream2.write(99);
        FileOutputStream fileOutputStream3 = new FileOutputStream("D:\\simin2.txt");
        fileOutputStream3.write(98);

        FileInputStream fileInputStream2 = new FileInputStream("D:\\simin.txt");
        System.out.println(fileInputStream2.read());
        FileInputStream fileInputStream3 = new FileInputStream("D:\\simin2.txt");
        System.out.println(fileInputStream3.read());
    }
}
