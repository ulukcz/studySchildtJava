package main.java.com.ulukbek.javacore.chapter07.AccessTest;

// В этой программе демонстрируется отличие
// модификаторов public и private
class Test {
    int a;                  // доступ предостовляемый по умолчанию
    public int b;           // открытый доступ
    private int c;          // закрытый доступ

    // методы доступа к члену с данного класса
    void setc(int i) {      // установить значение члена с данного класса
        c = i;
    }
    int getc() {            // получить значение члена с данного класса
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // эти операторы правильны, поэтому члены a и b
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может выдать ошибку
     // ob.c = 100; // ОШИБКА!

        // Доступ к члену данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setc(100);   // ВЕРНО!
        System.out.println("a, b и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
