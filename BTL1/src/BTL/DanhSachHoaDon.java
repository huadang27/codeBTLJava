package BTL;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoaDon implements Serializable {
    ArrayList<HoaDon> listHoaDon ;
    Scanner sc = new Scanner(System.in);

    public DanhSachHoaDon (){
        listHoaDon = new ArrayList<>() ;
    }
    public void enterInFo_DSHD() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" \nNhập Số Lượng Hóa Đơn : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            HoaDon h = new HoaDon();
            h.enterInFo_HD();
            listHoaDon.add(h);
        }
    }
    public void Show_DSHD() {
        for (HoaDon h : listHoaDon) {
            h.Show_HD();
        }
    }
    public float ThongKeDoanhThu() {
        float doanhthu = 0.0f;
        for (HoaDon h : listHoaDon) {
            doanhthu += h.TienkhachTra();
        }
        return doanhthu;
    }
    public void KhachThueLauNhat() {
        System.out.println(" Thông Tin Của Khách Hàng ");
        HoaDon launhat = listHoaDon.get(0);
        for (HoaDon h : listHoaDon) {
            if (h.soNgaythue() > launhat.soNgaythue()) {
                launhat = h;
            }
        }
        for(HoaDon x : listHoaDon)
        {
            if(launhat.soNgaythue()==x.soNgaythue())
                x.ThongTinKH();
        }
    }
    public void TimKiemKH_theoMaHD() {
        String tenKh;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã hóa đơn : ");
        tenKh = sc.nextLine();
        for (HoaDon p : listHoaDon) {
            if (tenKh.equals(p.getMahd())) {
                System.out.println(" Thông Tin Của Khách Hàng  ");
                p.ThongTinKH();
                
            }
        }
    }
    
    public void SapXepHoaDon (){
        Collections.sort(listHoaDon, (HoaDon o1 , HoaDon o2 )->
        (o1.getMahd().compareToIgnoreCase(o2.getMahd())));
        System.out.println("Danh sách hóa đơn  sau khi sắp xép theo mã hóa đơn  ");
        Show_DSHD();
        }
    public void ghiFileHD()  {
        try {
            FileOutputStream fname = new FileOutputStream("dsHoaDon.txt");
            ObjectOutputStream object = new ObjectOutputStream(fname);
            object.writeObject(listHoaDon);
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
    public void docFileHD (){
        try {
            FileInputStream fin = new FileInputStream("dsHoaDon.txt");
            ObjectInputStream fob = new ObjectInputStream(fin);
            System.out.println(" Dữ Liệu Trong File !!!");
            listHoaDon = (ArrayList<HoaDon> )fob.readObject();
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
        for(HoaDon h : listHoaDon) {
            h.Show_HD();
        }
    }
}


