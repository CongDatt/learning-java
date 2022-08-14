public class MayTinhCasio2 implements MayTinhBoTui {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Vui long nhap so khac 0");
        }
        return 0.0;  
    }
    
}
