class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}


class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
