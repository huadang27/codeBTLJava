package BTL;

import java.io.Serializable;
import java.util.Scanner;

public class HoaDon extends KhachHang implements Serializable {
 private String mahd ;
 private int ngayDen ;
 private int ngayDi ;
 private String ngaylap;
 private String tennv ;
 private String tenkh ;
 private int loaiphong ;
 private int dongia ;
 public KhachHang custormer ;

 public HoaDon() {
  mahd = "";
  ngayDen = 0 ;
  ngayDi = 0 ;
  ngaylap = "" ;
  tennv = "";
  tenkh = "";
  loaiphong = 0;
  dongia = 0 ;
  custormer = new KhachHang();
 }

 public HoaDon(String hoTen, String diaChi, String makh, String CMND, String sdt, String mahd, int ngayDen, int ngayDi, String ngaylap, String tennv, String tenkh, int loaiphong, int dongia, KhachHang custormer) {
  super(hoTen, diaChi, makh, CMND, sdt);
  this.mahd = mahd;
  this.ngayDen = ngayDen;
  this.ngayDi = ngayDi;
  this.ngaylap = ngaylap;
  this.tennv = tennv;
  this.tenkh = tenkh;
  this.loaiphong = loaiphong;
  this.dongia = dongia;
  this.custormer = custormer;
 }

 public void enterInFo_HD(){
  Scanner sc = new Scanner(System.in);
  System.out.print(" \nNhập mã hóa đơn       : ");
  mahd = sc.nextLine();
  System.out.print(" \nNgay Lap              : ");
  ngaylap = sc.nextLine();
  System.out.print(" \nNgày đến              : ");
  ngayDen = Integer.parseInt(sc.nextLine());
  System.out.print(" \nNhập ngày đi          : ");
  ngayDi = Integer.parseInt(sc.nextLine());
  System.out.print(" \nNhân viên lập hóa đơn : ");
  tennv = sc.nextLine();
  System.out.print(" \n -------Thông tin khách hàng thuê phòng ----------- ");
  this.custormer.enterInFo_KH();
  System.out.print(" \nNhập loại phòng (1.Phòng Vip   0.Phòng Thường) : ");
  loaiphong = Integer.parseInt(sc.nextLine());
  if(loaiphong==1){
   dongia=1000000;
  }
  else
   dongia=700000;
 }

 public int  soNgaythue (){
  return ngayDi - ngayDen ;
 }
 public float TienkhachTra () {
  float tienphaitra = 0.0f;
  if(loaiphong==1)
   tienphaitra =tienphaitra +dongia*soNgaythue();
  else {
   tienphaitra =tienphaitra +dongia*soNgaythue();
  }

  return tienphaitra;
 }
 public void Show_HD (){
  System.out.print(" \nMã Hóa Đơn     :"+mahd);
  System.out.print(" \nNgày Lập       :"+ngaylap);
  System.out.print(" \nTên Nhân Viên  :"+tennv);
  System.out.print(" \nMa Khách Hàng  :"+this.custormer.getMakh());
  System.out.print(" \nTên Khách Hàng :"+this.custormer.getHoTen());
  System.out.print(" \nNgày Đến       :"+ngayDen);
  System.out.print(" \nNgày Đi        :"+ngayDi);
  System.out.print(" \nSố Ngày Thuê   :"+soNgaythue());
  System.out.print(" \nTổng Tiền      :"+TienkhachTra());
  System.out.println("\n_________________________");
 }

 public void ThongTinKH (){
  String Loaiphong = "";
  if(loaiphong==1)
  {
   Loaiphong = " Phòng Vip ";
  }
  else if (loaiphong==0)
  {
   Loaiphong = "Phòng Thường ";
  }
  System.out.print(" \nMa Khách Hàng   : "+this.custormer.getMakh());
  System.out.print(" \nTên Khách Hàng  : "+this.custormer.getHoTen());
  System.out.print(" \nLoai Phòng      : "+Loaiphong);
  System.out.println("\n_______________________________");
 }

 public String getMahd() {
  return mahd;
 }

 public void setMahd(String mahd) {
  this.mahd = mahd;
 }

 public int getNgayDen() {
  return ngayDen;
 }

 public void setNgayDen(int ngayDen) {
  this.ngayDen = ngayDen;
 }

 public int getNgayDi() {
  return ngayDi;
 }

 public void setNgayDi(int ngayDi) {
  this.ngayDi = ngayDi;
 }

 public String getNgaylap() {
  return ngaylap;
 }

 public void setNgaylap(String ngaylap) {
  this.ngaylap = ngaylap;
 }

 public String getTennv() {
  return tennv;
 }

 public void setTennv(String tennv) {
  this.tennv = tennv;
 }

 public String getTenkh() {
  return tenkh;
 }

 public void setTenkh(String tenkh) {
  this.tenkh = tenkh;
 }

 public int getLoaiphong() {
  return loaiphong;
 }

 public void setLoaiphong(int loaiphong) {
  this.loaiphong = loaiphong;
 }

 public int getDongia() {
  return dongia;
 }

 public void setDongia(int dongia) {
  this.dongia = dongia;
 }

 public KhachHang getCustormer() {
  return custormer;
 }

 public void setCustormer(KhachHang custormer) {
  this.custormer = custormer;
 }
}


