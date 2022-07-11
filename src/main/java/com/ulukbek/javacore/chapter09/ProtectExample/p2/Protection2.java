package main.java.com.ulukbek.javacore.chapter09.ProtectExample.p2;

class Protection2 extends main.java.com.ulukbek.javacore.chapter09.ProtectExample.p1.Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
        // Доступ только для данного класса и пакета
        // System.out.println("n = " + n);
        // доступно только для класса
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);

    }
}
