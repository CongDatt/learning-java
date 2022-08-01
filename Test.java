class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDaDang;


    public TaiKhoanForum() {
        // this.tenDangNhap = "";
        // this.password = "";
        // thi
    }

    public TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDaDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDaDang = soBaiDaDang;
    }

    public boolean doiMatKhau(String old_pw, String new_pw) {
        if (old_pw.equals(this.password)) {
            this.password = new_pw;
            return true;
        }
        return false;
    }

    public String loaiThanhVien() {
        if (this.soBaiDaDang >= 50) return "Thanh vien VIP";
        else if (this.soBaiDaDang < 50 && this.soBaiDaDang >= 30) return "Thanh vien nang dong";
        else if (this.soBaiDaDang < 30 && this.soBaiDaDang >= 5) return "Thanh vien co dong gop";
        else return "Thanh vien moi";
    }

    @Override
    public String toString() {
        return "(" + this.tenDangNhap + ","
            + this.password + "," // This line is for testing doiMatKhau() method
            + this.ngayTao + ","
            + this.loaiThanhVien() + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        TaiKhoanForum a = new TaiKhoanForum("abc", "123", "23/1/2022", 50);
        TaiKhoanForum b = new TaiKhoanForum("abcd", "1234", "23/1/2022", 25);
        TaiKhoanForum c = new TaiKhoanForum("abcd", "1234", "23/1/2022", 40);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean isChange = a.doiMatKhau("123", "abc");
        if (isChange) {
            System.out.println(a);
        }
    }
}