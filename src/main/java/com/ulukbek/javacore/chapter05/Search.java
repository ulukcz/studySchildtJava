package main.java.com.ulukbek.javacore.chapter05;

// Поиск в массмве с применением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // использовать цикл for в стиле for each
        // для значения переменной val в массиве nums
        for (int x: nums) {
            if (x == val) {
                found = true;
            }
        }

        if (found)
            System.out.println("Значение найдено!");
    }
}
