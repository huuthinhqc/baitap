
import thuchanh_9.PhanSo;

public class App {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo ps3 = new PhanSo();
        PhanSo ps4 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psHieu = new PhanSo();
        PhanSo psTich = new PhanSo();
        PhanSo psThuong = new PhanSo();
        PhanSo psQuyDong1 = new PhanSo();
        PhanSo psQuyDong2 = new PhanSo();

        //Nhập phân số
        System.out.println("Nhập phân số 1: ");
        ps1.nhapPhanSo();
        ps1.hienThiPhanSo();
        System.out.println("Phân số rút gọn là: ");
        ps1.rutGon().hienThiPhanSo();

        System.out.println("Nhập phân số 2: ");
        ps2.nhapPhanSo();
        ps2.hienThiPhanSo();
        System.out.println("Phân số rút gọn là: ");
        ps2.rutGon().hienThiPhanSo();

        //tính tổng 2 phân số
        psTong = ps1.congPS(ps2);
        System.out.println("Tổng 2 phân số là : ");
        psTong.hienThiPhanSo();

        //tính hiệu 2 phân số
        psHieu = ps1.truPS(ps2);
        System.out.println("Hiệu 2 phân số là : ");
        psHieu.hienThiPhanSo();

        //tính tích 2 phân số
        psTich = ps1.tichPS(ps2);
        System.out.println("Tích 2 phân số là : ");
        psTich.hienThiPhanSo();

        //tính thương 2 phân số
        psThuong = ps1.thuongPS(ps2);
        System.out.println("Thương 2 phân số là : ");
        psThuong.hienThiPhanSo();

        //quy đồng
        psQuyDong1 = ps1.quyDongMauSo(ps2);
        psQuyDong2 = ps2.quyDongMauSo(ps1);
        System.out.println("Phân số quy đồng của phân số 1 là: ");
        psQuyDong1.hienThiPhanSo();
        System.out.println();
        System.out.println("Phân số quy đồng của phân số 2 là: ");
        psQuyDong2.hienThiPhanSo();

        //so sánh
        if (ps1.soSanhPS(ps2)==1) {
            System.out.println("Phân số 1 lớn hơn phân số 2");
        }
        else if(ps1.soSanhPS(ps2)==0){
            System.out.println("Phân số 1 bằng phân số 2");
        }
        else System.out.println("Phân số 1 nhỏ hơn phân số 2");

        //phân số tối giản
        System.out.println("Kiểm tra phân số tối giản");
        ps3.nhapPhanSo();
        if (ps3.kiemTraPSToiGian()) {
            System.out.println("Phân số tối giản");
        } else {
            System.out.println("Phân số chưa tối giản");
        }

        //Phân số âm dương
        System.out.println("Kiểm tra phân số âm dương");
        ps4.nhapPhanSo();
        if (ps4.kiemTraPSDuong()) {
            System.out.println("Phân số dương");
        } else {
            System.out.println("Phân số âm");
        }

    }
}
