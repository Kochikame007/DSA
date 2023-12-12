package java8;

public class ThreadDemo {

    public static void main(String[] args) {

        Thread t = new Thread(new Thread1("Happy"));
        Thread t1 = new Thread(new Thread1("Birthday"));
        t.start();
        t1.start();
    }



}


