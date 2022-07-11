package main.java.com.ulukbek.javacore.chapter07.OverloadDemo1;

// продемонстрировать перегрузку методов
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // одного перечисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }
    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // Перегружаемый метод, проверяющий наличие
    // параметров типа double
    double test(double a) {
        System.out.println("Double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // Вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова теста ob.test(123.25) " + result);
    }
}
