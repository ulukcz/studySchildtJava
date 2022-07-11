package main.java.com.ulukbek.javacore.chapter09.TestBalance;
import main.java.com.ulukbek.javacore.chapter09.MyPack.*;

public class TestBalance {
    public static void main(String[] args) {
        /* Класс Balance объявлен как public, поэтому им можно воспользвоаться
        и вызвать его конструктор */
        Balance test = new Balance("J.J. Jaspers", 99.88);

        test.show(); // можно вызвать также метод show()
    }
}
