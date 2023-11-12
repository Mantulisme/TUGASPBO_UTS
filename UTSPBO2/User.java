package UTSPBO2;

import java.util.List;

public class User extends Pengguna {
	public User(String nama) {
		super(nama);
	}
	
	public void indentifikasi() {
		System.out.println("User "+nama);	
	}
	
	public void liatBuku(List<Buku> daftarBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : daftarBuku) {
			System.out.println(buku);
		}
	}
}