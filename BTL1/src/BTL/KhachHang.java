package BTL;

import java.util.Scanner;

public class KhachHang extends PerSon {
    String makh;
    String CMND ;
    String sdt;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String diaChi, String makh, String CMND, String sdt) {
        super(hoTen, diaChi);
        this.makh = makh;
        this.CMND = CMND;
        this.sdt = sdt;
    }


    public void enterInFo_KH(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" \nNhập mã khách hàng  :");
        makh=sc.nextLine();
        super.enterInFo();
        System.out.print(" \nCMND                : ");
        CMND=sc.nextLine();
    }
    public void enterInFo_sdt(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" \nSố điện thoại       : ");
        sdt= sc.nextLine();
    }



    public void show_KH() {
        System.out.print(" \nMã khách hàng       : " + makh);
        super.show();
        System.out.print(" \nCMND                : " + CMND);
        System.out.print(" \nSĐT                 : " + sdt);
        System.out.println("\n_______________________________");
    }
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public KhachHang(String sdt) {
        this.sdt = sdt;
    }

    void Sdt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

