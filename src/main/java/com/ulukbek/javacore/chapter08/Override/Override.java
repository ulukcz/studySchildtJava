package main.java.com.ulukbek.javacore.chapter08.Override;

// переопределение метода
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
    void show() {
        super.show(); // Здесь вызываетя метод show() из класса A
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // Здесь вызываетя метод show() из класса В
    }
}
