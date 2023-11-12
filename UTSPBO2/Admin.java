package UTSPBO2;

import java.util.List;
public class Admin extends Pengguna {
	public Admin(String nama) {
		super(nama);
	}

	public void indentifikasi() {
		System.out.println("Admin "+nama);	
	}
	
	public void liatBuku(List<Buku> daftarBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : daftarBuku) {
			System.out.println(buku);
		}
	}

}