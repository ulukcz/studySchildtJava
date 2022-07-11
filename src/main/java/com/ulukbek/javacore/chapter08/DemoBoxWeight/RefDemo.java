package main.java.com.ulukbek.javacore.chapter08.DemoBoxWeight;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Объем weightBox равен " + vol);
        System.out.println("Вес weightBox равен " + weightBox.weight);
        System.out.println();

        // присвоить ссылке на объект Boxweight ссылки на объект Box
        plainBox = weightBox;
        vol = plainBox.volume();        // Верно, т.к. метод volume()
                                        // определен в классе Box
        System.out.println("Объем plainBox равен " + vol);

        // Следующий оператор ошибочен, поскольку член plainbox
        // не определяет член weight
        // System.out.println("Вес plainBox равен" + plainBox.weight);

    }
}
