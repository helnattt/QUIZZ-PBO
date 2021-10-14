import java.util.Scanner;
public class quizpbo {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama;
		int totalharga,kembali,harga,tipe,meteran,bayar;
		
		System.out.println("=====Tipe Pesawat=====");
		System.out.println("Tipe Rumah 31 : Rp 100000");
		System.out.println("Tipe Rumah 32 : Rp 125000");
		System.out.println("Tipe Rumah 33 : Rp 450000");
		System.out.println("Tipe Rumah 34 : Rp 480000");
		System.out.println("Tipe Rumah 35 : Rp 500000");
		System.out.println("Tipe Rumah 40 : Rp 550000");
		
		System.out.print("Masukkan Nama Anda: ");
		nama = input.nextLine();

		System.out.print("Pilih Tipe Rumah: ");
		tipe = input.nextInt();
		
		System.out.print("Masukkan Jumlah Meteran: ");
		meteran = input.nextInt();
		
		System.out.print("Total Harga : ");
		totalharga = input.nextInt();
		
		System.out.print("Bayar : ");
		bayar = input.nextInt();
		
		System.out.println("___________");
		
		if (tipe == 31){
			harga = 100000;
		} else if (tipe == 32){
			harga = 125000;
		} else if (tipe == 33){
			harga = 450000;
		} else if (tipe == 34){
			harga = 480000;
		} else if (tipe == 35){
			harga = 500000;
		} else {
			harga = 550000;
		}
		
		totalharga = harga*meteran;
		kembali = bayar-totalharga;
		
		System.out.println("Nama : " +nama);
		System.out.println("Total Harga : "+totalharga);
		System.out.println("Total yang dibayar: "+bayar);
		System.out.println("Kembalian : " +kembali);
		
		
	}
}