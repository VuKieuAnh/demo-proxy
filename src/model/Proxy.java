public class Proxy implements ITongGiamDoc {
    String name;
    String chucVu;

    private TongGiamDoc tongGiamDoc;

    public Proxy(String name, String chucVu) {
        this.name = name;
        this.chucVu = chucVu;
    }

    public Proxy() {
    }

    public Proxy(String name, String chucVu, TongGiamDoc tongGiamDoc) {
        this.name = name;
        this.chucVu = chucVu;
        this.tongGiamDoc = tongGiamDoc;
    }

    @Override
    public void duyetLuong() {

    }

    @Override
    public void xetTangLuong() {
        if (chucVu.equals("truongphong")){
            tongGiamDoc.xetTangLuong();
        }
    }

    @Override
    public void nhanDienthoai() {
        if (chucVu.equals("thuky")){
            tongGiamDoc.nhanDienthoai();
        }
        else throw new RuntimeException("Khong hop le");
    }
}
