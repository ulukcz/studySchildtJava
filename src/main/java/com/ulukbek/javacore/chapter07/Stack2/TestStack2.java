package main.java.com.ulukbek.javacore.chapter07.Stack2;

// Усовершенствованный класс Stack в котором
// использован член длины массива
class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }
    // Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
class TestStack2 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        // Извлечь числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());
        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
