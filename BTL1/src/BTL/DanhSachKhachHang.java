package BTL;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachKhachHang implements Serializable {
    ArrayList<KhachHang> listKhachHang ;
    Scanner sc = new Scanner(System.in) ;

    public DanhSachKhachHang (){
        listKhachHang = new ArrayList<>();
    }
    public void enterInFo_DSKH() {
        int sl;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập Số Lượng Khách Hàng :");
        sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            KhachHang k = new KhachHang();
            k.enterInFo_KH();
            k.enterInFo_sdt();
            listKhachHang.add(k);
        }
    }
    public void Show_DSKH() {
        for (KhachHang k : listKhachHang ) {
            k.show_KH();
        }
    }
    public void themKH() {
        System.out.print("Nhập số lượng khách hàng cần thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            KhachHang k = new KhachHang();
            k.enterInFo_KH();
            listKhachHang.add(k);
        }
        Show_DSKH();
    }
    public void sapxepKH(){
        Collections.sort(listKhachHang, (KhachHang o1, KhachHang o2) ->
                (o1.getMakh().compareToIgnoreCase(o2.getMakh())));
        System.out.println("Danh sách khách hàng sau khi sắp xép theo mã khách hàng ");
        Show_DSKH();
    }
    public void ghiFileKH()  {
        try {
            FileOutputStream fname = new FileOutputStream("dsKhachHang.txt");
            ObjectOutputStream object = new ObjectOutputStream(fname);
            object.writeObject(listKhachHang);
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
    public void docFileKH (){
        try {
            FileInputStream fin = new FileInputStream("dsKhachHang.txt");
            ObjectInputStream fob = new ObjectInputStream(fin);
            System.out.println(" Dữ Liệu Trong File !!!");
            listKhachHang = (ArrayList<KhachHang> )fob.readObject();
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
        for(KhachHang k : listKhachHang) {
            k.show_KH();
        }
    }

}
