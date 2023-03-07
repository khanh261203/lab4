// Lớp hình chữ nhật
class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (rong + dai);
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chieu dai: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

// Lớp hình vuông kế thừa từ lớp hình chữ nhật
class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

// Lớp chứa phương thức main
public class Main {
    public static void main(String[] args) {
        // Nhập chiều dài và chiều rộng của hình chữ nhật
        double dai = 6;
        double rong = 8;

        // Nhập cạnh của hình vuông
        double canh = 3;

        // Tạo đối tượng hình chữ nhật và xuất thông tin
        ChuNhat cn = new ChuNhat(dai, rong);
        System.out.println("Thong tin hinh chu nhat:");
        cn.xuat();

        // Tạo đối tượng hình vuông và xuất thông tin
        ChuNhat vu = new Vuong(canh);
        System.out.println("Thong tin hinh vuong:");
        vu.xuat();
    }
}
