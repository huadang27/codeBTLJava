package BTL;

import java.util.Scanner;
public class Menu {
    Scanner input = new Scanner(System.in);
    DanhSachNhanVien listnv = new DanhSachNhanVien();
    DanhSachKhachHang listkh = new DanhSachKhachHang();
    DanhSachPhong listP = new DanhSachPhong();
    DanhSachHoaDon listHD = new DanhSachHoaDon();
    public void chonMenuNV(){
        int chon;
        do{

            System.out.println("\n ---- Quản lí nhân viên ---- "
                    + "\n1. Nhập danh sách nhân viên"
                    + "\n2. Hiện danh sách nhân viên"
                    + "\n3. Thêm nhân viên vào danh sách"
                    + "\n4. Xóa nhân viên theo mã nhân viên"
                    + "\n5. Sắp xếp theo hệ số lương"
                    + "\n6. Ghi danh sách nhân viên vào file dsNhanVien.txt"
                    + "\n7. Đọc danh sách nhân viên từ file dsNhanVien.txt"
                    + "\n8. Quay lai menu chính"
                    + "\n0. thoát");
            System.out.print(" mời chọn: ");
            chon= Integer.parseInt(input.nextLine());
            switch(chon){
                case 1: listnv.enterInFo_DSNV();break;
                case 2: listnv.Show_DSNV();break;
                case 3: listnv.themNV();break;
                case 4: listnv.xoaNV();break;
                case 5: listnv.sapxepNV();break;
                case 6: listnv.ghiFileNV();break;
                case 7: listnv.docFileNV();break;
                case 0: System.exit(0);
            }
        } while(chon!=8);
    }
    public void chonMenuKH(){
        int chon;
        do{

            System.out.println("\n ---- Quản lí khách hàng ---- "
                    + "\n1. Nhập danh sách khách hàng"
                    + "\n2. Hiện danh sách khách hàng"
                    + "\n3. Thêm khách hàng vào danh sách"
                    + "\n4. Sắp xếp theo mã của khách hàng"
                    + "\n5. Ghi danh sách khách hàng vào file dsKhachHang.txt"
                    + "\n6. Đọc danh sách khách hàng từ file dsKhachHang.txt"
                    + "\n7. Quay lại menu chính"
                    + "\n0. thoát");
            System.out.print(" mời chọn: ");
            chon= Integer.parseInt(input.nextLine());
            switch(chon){
                case 1: listkh.enterInFo_DSKH(); break;
                case 2: listkh.Show_DSKH(); break;
                case 3: listkh.themKH(); break;
                case 4: listkh.sapxepKH(); break;
                case 5 :listkh.ghiFileKH(); break;
                case 6: listkh.docFileKH(); break;
                case 0: System.exit(0);
            }
        } while(chon!=7);
    }
    public void chonMenuP() {
        int chon;
        do {

            System.out.println("\n ---- Quản lí phòng  ---- "
                    + "\n1. Nhập danh sách phòng "
                    + "\n2. Hiện danh sách phòng"
                    + "\n3. Thêm danh sách phòng"
                    + "\n4. Sắp xếp theo mã phòng"
                    + "\n5. Xóa theo mã phòng"
                    + "\n6. Ghi danh sách phong vào file dsPhong.txt"
                    + "\n7. Đọc danh sách phong từ file dsPhong.txt"
                    + "\n8. Quay lại menu chính"
                    + "\n0. thoát");
            System.out.print(" mời chọn: ");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    listP.enterInFo_DSP();
                    break;
                case 2:
                    listP.Show_DSP();
                    break;
                case 3:
                    listP.themP();
                    break;
                case 4:
                    listP.sapxepP();
                    break;
                case 5:
                    listP.xoaP();
                    break;
                case 6:
                    listP.ghiFileP();
                    break;
                case 7:
                    listP.docFileP();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (chon != 8);
    }
    public void chonMenuHd(){
        int chon;
        do{
            System.out.println("\n ---- Quản lí hóa đơn ---- "
                    + "\n1. Nhập danh sách hóa đơn "
                    + "\n2. Hiện danh sách hóa đơn"
                    + "\n3. Thông kê doang thu "
                    + "\n4. Khách thuê lâu nhất "
                    + "\n5. Tìm kiếm khách hàng theo mã hóa đơn"
                    + "\n6. Sắp xếp hóa đơn theo mã hóa đơn "
                    + "\n7. Ghi danh sách hóa đơn vào file dsHoaDon.txt"
                    + "\n8. Đọc danh sách hóa đơn từ file dsHoaDon.txt"
                    + "\n9. Quay lại menu chính"
                    + "\n0. thoát");
            System.out.print(" mời chọn: ");
            chon= Integer.parseInt(input.nextLine());
            switch(chon){
                case 1: listHD.enterInFo_DSHD(); break;
                case 2: listHD.Show_DSHD(); break;
                case 3:
                System.out.print("Thống Kê Doanh Thu"+ listHD.ThongKeDoanhThu()); break;
                case 4: listHD.KhachThueLauNhat(); break;
                case 5: listHD.TimKiemKH_theoMaHD(); break;
                case 6: listHD.SapXepHoaDon(); break;
                case 7: listHD.ghiFileHD(); break;
                case 8: listHD.docFileHD(); break;
                case 0: System.exit(0);
            }
        } while(chon!=9);
    }
}

