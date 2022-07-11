package main.java.com.ulukbek.javacore.chapter07.TestStack;

// В этом классе определяется целочисленный стек, который
// может содержать 10 целочисленных значений
class Stack {
    /* теперь переменные stck и tos являются закрытыми.
       Это означает, что они не могут случайно или намеренно
       изменены таким образом, чтобы нарушить стек.
    */
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // Разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
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
class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        // Извлечь числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());
        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());

        // эти операции недопустимы
//      myStack1.tos = -2;
//      myStack2.stck[3] = 100;
    }
}
