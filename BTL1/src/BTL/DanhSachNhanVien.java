package BTL;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachNhanVien implements Serializable {
    ArrayList<NhanVien> listNhanVien ;
    Scanner sc = new Scanner(System.in);

    public DanhSachNhanVien (){
        listNhanVien = new ArrayList<>();
    }

    public void enterInFo_DSNV() {
        int sl ;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập Số Lượng Nhân Viên  :");
        sl = sc.nextInt();
        for(int i=0 ; i<sl ; i++) {
            NhanVien n = new NhanVien();
            n.enterInfo_NV();
            listNhanVien.add(n);
        }

     }
    public void Show_DSNV() {
        for (NhanVien n : listNhanVien ) {
            n.show_NV();
        }
    }
    public void themNV() {
        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien();
            x.enterInfo_NV();
            listNhanVien.add(x);
        }
        Show_DSNV();
    }
    public void xoaNV() {
        String k;
        int dem = 0;
        System.out.print("nhập mã nhân viên cần xóa: ");
        sc.nextLine();
        k = sc.nextLine();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMaNV().equalsIgnoreCase(k)) {
                listNhanVien.remove(i);
                dem++;
            }

        }
        if (dem == 0) {
            System.out.println("không tìm thấy nhân viên này ");
        } else {
            System.out.println("\ndanh sách nhân viên sau khi xóa ");
            Show_DSNV();
        }

    }
    public void sapxepNV() {
        Collections.sort(listNhanVien, (NhanVien o1, NhanVien o2) -> {
            if (o1.getHsl() > o2.getHsl())
                return 1;
            else {
                if (o1.getHsl() == o2.getHsl())
                    return 0;
                else
                    return -1;
            }
        });
        System.out.println(" -- danh sách sau khi sắp xếp---");
        Show_DSNV();
    }
    
    public void ghiFileNV()  {
        try {
            FileOutputStream fname = new FileOutputStream("dsNhanVien.txt");
            ObjectOutputStream object = new ObjectOutputStream(fname);
            object.writeObject(listNhanVien);
            System.out.print(" \nGhi File Thanh Cong\n");
            fname.close();
            object.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void docFileNV (){
        try {
            FileInputStream fin = new FileInputStream("dsNhanVien.txt");
            ObjectInputStream fob = new ObjectInputStream(fin);
            System.out.println(" Dữ Liệu Trong File !!!");
            listNhanVien = (ArrayList<NhanVien> )fob.readObject();
            fin.close();
            fob.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(" ---Danh sách file sau khi đã được đọc--- ");
        for(NhanVien n : listNhanVien) {
            n.show_NV();
        }
    }
}
