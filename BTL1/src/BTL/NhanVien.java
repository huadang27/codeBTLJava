package BTL;

import javax.swing.*;
import java.io.Serializable;
import java.util.Scanner;

    public class NhanVien extends KhachHang implements Serializable {
        private String maNV ;
        private String gioiTinh ;
        private float hsl ;
        private String hoTen;
        private String DiaChi;

        public NhanVien() {
            maNV = "";
            hoTen ="";
            DiaChi ="";
            gioiTinh = "";
            hsl = 0 ;

        }

        public NhanVien(String hoTen, String diaChi, String maNV, String sdt, String gioiTinh, float hsl) {
            super();
            this.maNV = maNV;
            this.hoTen =hoTen;
            this.DiaChi=diaChi;
            this.gioiTinh = gioiTinh;
            this.hsl = hsl;
        }

        public void enterInfo_NV (){
            
            Scanner sc = new Scanner(System.in );
            System.out.print(" \nNhập mã nhân viên : ");
            maNV = sc.nextLine();
            System.out.print(" \nNhập Họ Tên       : ");
            hoTen = sc.nextLine();
            System.out.print(" \nNhập Địa Chỉ    : ");
            DiaChi = sc.nextLine();
            super.enterInFo_sdt();
            System.out.print(" \nNhập giới tính    :");
            gioiTinh = sc.nextLine();
            
            System.out.print(" \nHệ số lương       : ");
            hsl = sc.nextFloat();
        }
        public float tinhLuong (){
            return hsl*1135 ;
        }
        public void show_NV (){
            System.out.print(" \nMã Nhân Viên      : "+maNV);
            super.show();
            System.out.print(" \nGiới Tính         : "+gioiTinh);
            System.out.print(" \nHọ Tên               : "+hoTen);
            System.out.print(" \nHệ số lương       : "+hsl);
            System.out.print(" \nLương             : "+tinhLuong());
            System.out.println("\n___________________________________");
        }

        public String getMaNV() {
            return maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

   
    

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public float getHsl() {
            return hsl;
        }

        public void setHsl(float hsl) {
            this.hsl = hsl;
        }
    }
