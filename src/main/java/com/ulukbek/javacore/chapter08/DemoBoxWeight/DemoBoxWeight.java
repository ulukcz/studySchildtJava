package main.java.com.ulukbek.javacore.chapter08.DemoBoxWeight;

// В этой программе наследование применяется для расширения класса Box
class Box {
    double width;
    double height;
    double depth;
    // Сконструирован клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор применяемый в остутсвии размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // Конструктор выполняемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// Расширить класс Вох, включив в него поле веса
class BoxWeight extends Box {
    double weight;      //вес параллелепипеда

    // Конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
// Этот класс расширяет класс Box включая в него свойство цвета
class ColorBox extends Box {
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        System.out.println("Вес myBox2 равен " + myBox2.weight);

    }
}
