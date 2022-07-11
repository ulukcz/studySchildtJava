package main.java.com.ulukbek.javacore.chapter08.DemoShipment;

// Расширение класса BoxWeight включением в него
// поля стоимости доставки

// Создать сначала класс Box
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
// добавить поле веса
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
class Shipment extends BoxWeight {
    double cost;

    // Сконструирован клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    // Конструктор, при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    // Конструктор применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }
    // конструктор, выполняемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();
    }
}