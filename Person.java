public class Person {
    String name;
    int age;


     static  int count=0;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count ++;
    }

    public void print() {
        System.out.println(name + " " + age + "  " +count);
    }

}
