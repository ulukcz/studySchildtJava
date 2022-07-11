package main.java.com.ulukbek.javacore.chapter08.UseSuper;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A {
    int i;
}
// Создать подкласс путем расширения класса А
class B extends A {
    int i; // этот член i скрывет член i из класса А

    B(int a, int b) {
        super.i = a;        // Член i из класса А
        i = b;              // Член i из класса В
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
