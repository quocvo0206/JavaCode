import java.util.*;
// tao abstract ThongTin dung cho NhanVien  va TruongPhong thua ke
abstract class ThongTin{
	abstract String ten();
	abstract int tuoi();
	abstract float luong();
}
// tao interface TheThao dung cho NhanVien thua ke
interface TheThao{
	public float dongQuy();
	public String soTruong();
}

// tao interface CongDoan dung cho NhanVien va TruongPhong thua ke
interface CongDoan{
	public String vanNghe();
	public String hoatDongGayQuy();
}

class Nhap{
	// phuong thuc dung lay ve chuoi ky tu tren ban phim
	public static String layChuoi(){
		Scanner ca = new Scanner(System.in);
		return ca.nextLine();
	}
	// phuong thuc dung lay ve so nguyen tu tren ban phim
	public static int laySoNguyen(){
		Scanner ca = new Scanner(System.in);
		return ca.nextInt();
	}
	// phuong thuc lay so thuc thuc tren ban phim
	public static float laySoThuc(){
		Scanner ca = new Scanner(System.in);
		return ca.nextFloat();
	}
}

class NhanVien extends ThongTin implements TheThao, CongDoan{
	// overwriting method of ThongTin

	public String ten(){
		return Nhap.layChuoi();
	}

	public int tuoi(){
		return Nhap.laySoNguyen();
	}

	public float luong(){
		return Nhap.laySoThuc();
	}

	// define method of TheThao and CongDoan
	public float dongQuy(){
		return Nhap.laySoThuc();
	}

	public String soTruong(){
		return Nhap.layChuoi();
	}

	public String vanNghe(){
		return Nhap.layChuoi();
	}

	public String hoatDongGayQuy(){
		return Nhap.layChuoi();
	}
	
}

class TruongPhong extends ThongTin implements TheThao{
	// overwriting method of ThongTin

	public String ten(){
		return Nhap.layChuoi();
	}

	public int tuoi(){
		return Nhap.laySoNguyen();
	}

	public float luong(){
		return Nhap.laySoThuc();
	}

	// define method of TheThao

	public float dongQuy(){
		return Nhap.laySoThuc();
	}

	public String soTruong(){
		return Nhap.layChuoi();
	}
	
}
// tao object quan ly NhanVien va TruongPhong thong qua viec nhap du lieu tu ban phim
class PtStaffManagement{
	public PtStaffManagement(){
		//  yeu cau chay mai
		while(true){
			System.out.println("Choose 1 if you want enter information Employees:");
			System.out.println("Choose 2 if you want enter information Manager:");
			int n = Nhap.laySoNguyen();

		switch(n){
			case 1:
			System.out.println("How many employees do you want to enter?");
			int a = Nhap.laySoNguyen();
			NhanVien[] nv = new NhanVien[a];
			for(int i = 0; i < nv.length; i++){
				nv[i] = new NhanVien();
				System.out.println("Nhap ten nhan vien thu:" + (i+1));
				nv[i].ten();
				System.out.println("Nhap tuoi nhan vien thu:" + (i+1));
				nv[i].tuoi();
				System.out.println("Nhap luong nhan vien thu:" + (i+1));
				nv[i].luong();
				System.out.println("Nhap so tien dong quy cua nhan vien thu:" + (i+1));
				nv[i].dongQuy();
				System.out.println("Nhap so Truong cua nhan vien thu:" + (i+1));
				nv[i].soTruong();
				System.out.println("Nhap van nghe cua nhan vien thu:" + (i+1));
				nv[i].vanNghe();
				System.out.println("Nhap hoat dong gay quy cua nhan vien thu:" + (i+1));
				nv[i].hoatDongGayQuy();
			}
			break;
			case 2:
			System.out.println("How many manager do you want to enter?");
			int b = Nhap.laySoNguyen();
			TruongPhong[] tp = new TruongPhong[b];
			for(int j = 0; j < tp.length; j++){
				tp[j] = new TruongPhong();
				System.out.println("Nhap ten truong phong thu:" + (j+1));
				tp[j].ten();
				System.out.println("Nhap tuoi truong phong thu:" + (j+1));
				tp[j].tuoi();
				System.out.println("Nhap luong truong phong thu:" + (j+1));
				tp[j].luong();
				System.out.println("Nhap so tien dong quy cua truong phong thu:" + (j+1));
				tp[j].dongQuy();
				System.out.println("Nhap so Truong cua truong phong thu:" + (j+1));
				tp[j].soTruong();
		}
		break;
		}
		// khi nhap xong hoi nguoi dung co muon nhap tiep khong?
		System.out.println("You are continue? Y or N:");

		if("y".equalsIgnoreCase(Nhap.layChuoi())){

			continue;

		} else{

			break;

				}
			}
		}
	}

	class MainPro{
		public static void main(String[] a){
			new PtStaffManagement();
		}
	}
			 

			 