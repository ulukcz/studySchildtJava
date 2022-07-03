package main.java.com.ulukbek.javacore.chapter05;

// Продемонстрировать применение оператора цикла for
public class ForTick {
    public static void main(String[] args) {
        // Здесь переменная n объявляется в самом цикле
        for (int n = 10; n > 0; n--) {
            System.out.println("такт " + n);
        }
    }
}
