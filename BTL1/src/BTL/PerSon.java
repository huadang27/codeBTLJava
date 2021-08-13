package BTL;

import java.io.Serializable;
import java.util.Scanner;

    public class PerSon implements Serializable {
        private String hoTen ;
        private String diaChi ;

        public PerSon() {
            hoTen = "";
            diaChi = "";
        }

        public PerSon(String hoTen, String diaChi) {
            this.hoTen = hoTen;
            this.diaChi = diaChi;

        }
        public void enterInFo  (){
            Scanner sc = new Scanner(System.in);
            System.out.print(" \nNhập họ tên       : ");
            hoTen = sc.nextLine();
            System.out.print(" \nNhập địa chỉ     : ");
            diaChi = sc.nextLine();

        }
        public void show (){
            System.out.print(" \nHọ Tên            : "+hoTen);
            System.out.print(" \nĐịa chỉ           : "+diaChi);
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
    }

