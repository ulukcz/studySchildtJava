package main.java.com.ulukbek.javacore.chapter09.IFExtend;

// один интерфейс может расширять другой
interface A {
    void meth1();
    void meth2();
}
// теперь интерфейс А включает в себя методы meth1() и meth2()
// и добавляет meth3()
interface B extends A {
    void meth3();
}
// этот класс должен реализовать все методы из интерфейсов А и В
class MyClass implements B {
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }
    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }
    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}
class IFEXtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
