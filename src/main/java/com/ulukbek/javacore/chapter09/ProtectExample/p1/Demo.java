package main.java.com.ulukbek.javacore.chapter09.ProtectExample.p1;

// получить экземпляры из различный классов пакета p1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
