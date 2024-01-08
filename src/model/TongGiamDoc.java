public class TongGiamDoc implements ITongGiamDoc {
    String name;
    int salary;
    @Override
    public void duyetLuong() {

    }

    @Override
    public void xetTangLuong() {
        System.out.println("Xet tang luong thanh cong");
    }

    @Override
    public void nhanDienthoai() {
        System.out.println("Alo ai day, minh TGD day");
    }
}
