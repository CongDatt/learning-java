class Hello {

    public static void main(String[] args) {
        System.out.println("Test cau a: ");
        MayTinhCasio1 mt = new MayTinhCasio1();
        System.out.println("a + b = " + mt.cong(1, 2) );
        System.out.println("a - b = " + mt.tru(1, 2) );
        System.out.println("a * b = " + mt.nhan(1, 2) );
        System.out.println("a / b = " + mt.chia(1, 0) );
    }
}