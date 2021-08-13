package BTL;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public  class DanhSachPhong implements Serializable {
    ArrayList<Phong> listPhong;

    public DanhSachPhong() {

        listPhong = new ArrayList<>();
    }

    //nhap phong
    public void enterInFo_DSP() {
        Scanner sc = new Scanner(System.in);
        int sl ;
        System.out.print("\n Nhập Số Lượng Phòng :");
        sl = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<sl ; i++) {
            Phong x = new Phong();
            x.enterInFo_P();
            listPhong.add(x);
        }
    }

    //hien phong
    public void Show_DSP() {
        for (Phong x : listPhong) {
            x.Show_P();
        }
    }
    public void themP(){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("\n nhập số lượng thêm phòng : ");
        n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            Phong p= new Phong();
            p.enterInFo_P();
            listPhong.add(p);
        }
        Show_DSP();
    }
    public void xoaP(){
        Scanner sc = new Scanner(System.in);
        String k;
        int dem=0;
        System.out.printf("\nnhập mã phòng cần xóa : ");
        k =sc.nextLine();
        for(int i=0;i<listPhong.size();i++)
        {
            if(listPhong.get(i).getMaPhong().equalsIgnoreCase(k))
            {
                listPhong.remove(i);
                dem++;
            }
        }
        if(dem == 0)
        {
            System.out.println("không tìm thấy phòng  ");
        }
        else{
            System.out.println("--- Danh sách sau khi xóa ----");
            Show_DSP();
        }

    }
    public void sapxepP() {
        Collections.sort(listPhong, (Phong o1, Phong o2) ->
                (o1.getMaPhong().compareToIgnoreCase(o2.getMaPhong())));
        System.out.println("Danh sách phòng sau khi sắp xếp theo mã phòng ");
        Show_DSP();
    }

    public void ghiFileP()  {
        try {
            FileOutputStream fname = new FileOutputStream("dsPhong.txt");
            ObjectOutputStream object = new ObjectOutputStream(fname);
            object.writeObject(listPhong);
            System.out.print(" \nGhi File Thanh Cong !!!\n");
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
    public void docFileP (){
        try {
            FileInputStream fin = new FileInputStream("dsPhong.txt");
            ObjectInputStream fob = new ObjectInputStream(fin);
            System.out.println(" Dữ Liệu Trong File !!!");
            listPhong = (ArrayList<Phong> )fob.readObject();
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
        for(Phong p : listPhong) {
            p.Show_P();
        }
    }
}

