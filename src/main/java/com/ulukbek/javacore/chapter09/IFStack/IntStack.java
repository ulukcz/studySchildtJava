package main.java.com.ulukbek.javacore.chapter09.IFStack;

interface IntStack {
    void push(int item);    // сохранить элемент в стеке
    int pop();              // извлечь элемент из стека

    // У метода clear() теперь имеется вариант по умолчанию, поэтому
    // его придется реализовать в том существующем классе, где уже
    // применяется интерфейс IntStack
    default void clear() {
        System.out.println("метод clear() не реализован");
    }
}
