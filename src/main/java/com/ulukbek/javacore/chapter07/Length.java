package main.java.com.ulukbek.javacore.chapter07;

// В этой программе демонстрируется применение члена длины массива
public class Length {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("Длина a1 равна " + a1.length);
        System.out.println("Длина a2 равна " + a2.length);
        System.out.println("Длина a3 равна " + a3.length);
    }
}
