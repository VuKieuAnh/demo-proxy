public class Main {
    public static void main(String[] args) {
        TongGiamDoc tongGiamDoc = new TongGiamDoc();
        Proxy thang = new Proxy("thang", "thuky", tongGiamDoc);
        Proxy hai = new Proxy("hai", "truongphong", tongGiamDoc);
        thang.nhanDienthoai();
    }
}
