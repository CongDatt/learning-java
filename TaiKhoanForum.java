import java.util.TooManyListenersException;

public class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDang;

    TaiKhoanForum() {}

    TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDang = soBaiDang;
        
    }



    public String loaiThanhvien() {
        if(this.soBaiDang > 50) {
            return "Thanh Vien VIP";
        }
        else if (this.soBaiDang >= 30 && this.soBaiDang < 50) {
            return "Thanh vien nang dong";
        }
        else if(this.soBaiDang < 30 && this.soBaiDang >= 5) {
            return "Thanh vien co dong gop";
        }
        return "Thanh vien moi";
        
    }

    @Override
    public String toString() {
        return "(" + this.tenDangNhap + "," + this.ngayTao + "," + this.loaiThanhvien() +")";
    }

public static void main(String[] args) {
    TaiKhoanForum account = new TaiKhoanForum("username", "password", "20/07/2022", 10);
    account.toString();
}

}
