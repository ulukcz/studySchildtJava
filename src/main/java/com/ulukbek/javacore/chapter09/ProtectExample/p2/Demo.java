package main.java.com.ulukbek.javacore.chapter09.ProtectExample.p2;

// получить экземпляры из различный классов пакета p2
public class Demo {
    public static void main(String[] args) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}
