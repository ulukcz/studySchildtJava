package main.java.com.ulukbek.javacore.chapter08.CollingCons;

// Продемонстрировать порядок вызова конструкторов

// Создать суперкласс
class A {
    A() {
        System.out.println("B конструкторе А.");
    }
}
// Создеть подкласс путем расширения класса А
class B extends A {
    B() {
        System.out.println("В конструкторе В.");
    }
}
// Создеть еще один подкласс путем расширения класса В
class C extends B {
    C() {
        System.out.println("В конструкторе C.");
    }
}
class CollingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
