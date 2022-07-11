package main.java.com.ulukbek.javacore.chapter09.IFStack;

class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // Извлечь эти числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());
        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
