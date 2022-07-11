package main.java.com.ulukbek.javacore.chapter07.OverloadDemo2;

// применить автоматическое преоброзование типов к перегрузке
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // Перегружаемый метод, проверяющий наличие
    // параметров типа double
    void test(double a) {
        System.out.println("Внутренне преоброзование при вызове test(double) a: " + a);
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        double result;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // Здесь вызывается вариант метода test(double)
        ob.test(123.2); // А здесь вызывается вариант метода test(double)
    }
}
