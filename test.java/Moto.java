public class Moto extends Bike{
    /**
     *
     */
    @Override
    void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        Moto a = new Moto();
        a.run();
    }
}
