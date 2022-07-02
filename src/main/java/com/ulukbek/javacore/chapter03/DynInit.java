package main.java.com.ulukbek.javacore.chapter03;

// В этом примере используется динамическая типизация
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        // динамическая типисация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
