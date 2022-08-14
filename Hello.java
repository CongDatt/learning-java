class Hello {

    public static void main(String[] args) {
        HangSanXuat HSX1 = new HangSanXuat("Hang 1", "Viet Nam");
        HangSanXuat HSX2 = new HangSanXuat("Hang 2", "Nhat");
        HangSanXuat HSX3 = new HangSanXuat("Hang 3", "USA");

        PhuongTienDiChuyen p1 = new Oto("O to 1", HSX1, "Xang");
        PhuongTienDiChuyen p2 = new XeDap("Xe dap 1", HSX2);
        PhuongTienDiChuyen p3 = new MayBay("May bay ba gia", HSX3, "Khong biet");

        System.out.println(p1.tenLoaiPhuongTien);
        System.out.println(p1.LayvanToc());
        System.out.println(p1.hangSanXuat.getTenHangSanXuat());
        System.out.println(p1.hangSanXuat.getTenQuocGia());

    }
}