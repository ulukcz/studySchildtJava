package main.java.com.ulukbek.javacore.chapter09.IFStack;

class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;                           // создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;   // Загрузить динамический стек
        // разместить числа в стеке
        for (int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;   // Загрузить фиксированный стек
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.println(myStack.pop());
        myStack = fs;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack.pop());
    }
}
