public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(1, 0);
        ToaDo td2 = new ToaDo(0, 0);
        ToaDo td3 = new ToaDo(1, 1);

        Hinh h1 = new Diem(td1);
        Hinh hinhTron = new HinhTron(td1, 10);

        System.out.println("Dien tich h1: " + h1.tinhDienTich());
        System.out.println("Dien tich hinh tron: " + hinhTron.tinhDienTich());
    }
}
