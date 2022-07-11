package main.java.com.ulukbek.javacore.chapter09.TestInterface;

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
