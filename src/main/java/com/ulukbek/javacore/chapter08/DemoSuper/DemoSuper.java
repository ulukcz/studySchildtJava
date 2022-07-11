package main.java.com.ulukbek.javacore.chapter08.DemoSuper;

// Полная реализация класса BoxWeight
class Box {
    private double width;
    private double height;
    private double depth;
    // Сконструирован клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Конструктор, применяемы при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, применяемый в остутсвии размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // Конструктор, выполняемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// Теперь в классе BoxWeight полностью реализованы все конструкторы
class BoxWeight extends Box {
    double weight;      //вес параллелепипеда
    // Сконструирован клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    // Конструктор BoxWeight при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    // Конструктор применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }
    // конструктор, выполняемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight(); // default
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        System.out.println("Вес myBox2 равен " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Объем myBox3 равен " + vol);
        System.out.println("Вес myBox3 равен " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Объем myClone равен " + vol);
        System.out.println("Вес myClone равен " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объем myCube равен " + vol);
        System.out.println("Вес myCube равен " + myCube.weight);
        System.out.println();
    }
}
