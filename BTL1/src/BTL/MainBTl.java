package BTL;

import java.util.Scanner;
public class MainBTl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu mn = new Menu();
        int chon;
        do{
            System.out.print("\n ---- QUẢN LÝ KHÁCH SẠN ---- "
                    + "\n1. Quản lý Nhân Viên"
                    + "\n2. Quản lý Khách Hàng"
                    + "\n3. Quản lý Phòng "
                    + "\n4. Quản Lý Hóa Đơn"
                    + "\n0. thoát");
            System.out.print("\nNhập lựa chọn : ");
            chon= Integer.parseInt(input.nextLine());
            switch(chon)
            {
                case 1: mn.chonMenuNV(); break;
                case 2: mn.chonMenuKH(); break;
                case 3: mn.chonMenuP(); break;
                case 4: mn.chonMenuHd(); break;
                case 0: System.exit(0);
            }
        }while (chon !=0);
    }

}