public class HinhChuNhat extends Hinh {
    private double chieuRong, chieuDai;

    public HinhChuNhat(ToaDo toaDo, double chieuDai, double chieuRong) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }
    
}
