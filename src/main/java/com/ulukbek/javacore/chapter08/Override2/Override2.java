package main.java.com.ulukbek.javacore.chapter08.Override2;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i, j
    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // Перегрузить метод show
    void show(String msg) {
        System.out.println(msg + k);
    }
}
class Override2 {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("This is k: ");      // вызвать метод show() из класса В
        subOb.show();                        // вызвать метод show() из класса А
    }
}
