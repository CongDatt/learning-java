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

class Hi extends Thread {
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
    public static void main(String[] args) {
        Hello hello = new Hello();
        Hi hi = new Hi();

        Thread t1 = new Thread(hello);
        t1.start();
        hi.start();

    }
}
