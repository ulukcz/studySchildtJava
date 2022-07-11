package main.java.com.ulukbek.javacore.chapter06.BoxDemo2;

class Box {
    double width;
    double height;
    double depth;
}
class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        // Присвоить значение переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присвоить другие значение переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Рассчитать объем первого параллепипеда
        vol = myBox1.height * myBox1.width * myBox1.depth;
        System.out.println("Объем равен " + vol);

        // Рассчитать объем второго параллепипеда
        vol = myBox2.height * myBox2.width * myBox2.depth;
        System.out.println("Объем равен " + vol);

    }
}
