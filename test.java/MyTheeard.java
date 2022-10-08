import java.util.SimpleTimeZone;

class Hello implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i ++) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}

class Hi implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i ++) {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}


public class MyTheeard {
    public static void main(String[] args) throws InterruptedException {
        Hello hello = new Hello();
        Hi hi = new Hi();

        Thread t1 = new Thread(hello);
        Thread t2 = new Thread(hi);


        t1.start();
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
    }
}
