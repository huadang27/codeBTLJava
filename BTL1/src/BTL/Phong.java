package BTL;

import java.io.Serializable;
import java.util.Scanner;

public class Phong implements Serializable {
    private String maPhong ;
    private String tenPhong ;
    private String moTa ;
    private int tinhtrang ;

    public Phong() {
        maPhong = "";
        tenPhong = "";
        moTa = "";
        tinhtrang = 0 ;
    }
    public Phong(String maPhong, String tenPhong, String moTa, int tinhtrang) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.moTa = moTa;
        this.tinhtrang = tinhtrang;
    }
    public void enterInFo_P (){
        Scanner sc = new Scanner(System.in);
        System.out.print(" \nNhập mã phòng  :");
        maPhong = sc.nextLine();
        System.out.print(" \nNhập tên phòng :");
        tenPhong = sc.nextLine();
        System.out.print(" \nNhập mô tả     :");
        moTa = sc.nextLine();
        System.out.print(" \nNhập tình trạng (1.Đã thuê   0.Trống ) :");
        tinhtrang = Integer.parseInt(sc.nextLine());
    }
    public void Show_P (){
        System.out.print(" \nMã Phòng   : "+maPhong);
        System.out.print(" \nTên Phòng  : "+tenPhong);
        System.out.print(" \nMô Tả      : "+moTa);
        String TinhTrang = "";
        if (tinhtrang == 1) {
            TinhTrang = "Đã Thuê ";
        } else if (tinhtrang == 0) {
            TinhTrang = "Trống ";
        }
        System.out.print(" \nTình Trạng : "+TinhTrang);
        System.out.println( "\n__________________");
    }


    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    void enterInfo_NV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

