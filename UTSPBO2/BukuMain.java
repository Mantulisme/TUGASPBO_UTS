package UTSPBO2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BukuMain {
    
    public static void hapusBuku(List<Buku> daftarBuku, Buku buku) {
        if (daftarBuku.contains(buku)) {
            daftarBuku.remove(buku);
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            List<Buku> daftarBuku = new ArrayList<Buku>();
            daftarBuku.add(new Fiksi("The Lost Hero"));
            daftarBuku.add(new Fiksi("Harry Potter and the Goblet of Fire"));
            daftarBuku.add(new Fiksi("Percy Jackson & The Olympians: The Lightning Thief"));
            daftarBuku.add(new Fiksi("Harry Potter and the Deathly Hallow"));
            daftarBuku.add(new NonFiksi("Meditation"));
            daftarBuku.add(new NonFiksi("7 Habits of Highly Effective People"));
            daftarBuku.add(new NonFiksi("Structure"));
            daftarBuku.add(new NonFiksi("Atomic Habit"));
            
            System.out.print("Login (User/Admin): ");
            String login = input.nextLine();
            if (login.equalsIgnoreCase("User")) {
                System.out.print("Masukkan Nama User: ");
                String nama = input.nextLine();
                User user = new User(nama);
                user.indentifikasi();
                System.out.println();
                user.liatBuku(daftarBuku);
            } else if (login.equalsIgnoreCase("Admin")) {
                System.out.print("Masukkan Nama Admin: ");
                String nama = input.nextLine();
                Admin admin = new Admin(nama);
                admin.indentifikasi();
                System.out.println();
                System.out.println("Pilih Menu:");
                System.out.println("1. Tambah Buku pada menu");
                System.out.println("2. Lihat Daftar Buku menu");
                System.out.println("3. Hapus Buku");
                System.out.print("Masukkan Pilihan Menu (1-3): ");
                int pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1: {
                        System.out.println();
                        System.out.print("Masukkan judul Buku Baru yang diinginkan : ");
                        String judulBaru = input.nextLine();
                        System.out.print("Masukkan Genre Buku yang diinginkan : ");
                        String genreBaru = input.nextLine();
                        if (genreBaru.equalsIgnoreCase("Fiksi")) {
                            daftarBuku.add(new Fiksi(judulBaru));
                            System.out.println("Buku yang diinginkan berhasil ditambahkan");
                            admin.liatBuku(daftarBuku);
                        } else if (genreBaru.equalsIgnoreCase("Non-Fiksi")) {
                            daftarBuku.add(new NonFiksi(judulBaru));
                            System.out.println("Buku yang diinginkan berhasil ditambahkan");
                            admin.liatBuku(daftarBuku);
                        }
                        break;
                    }
                    case 2: {
                        System.out.println();
                        admin.liatBuku(daftarBuku);
                        break;
                    }
                    case 3: {
                        System.out.println();
                        System.out.print("Masukkan judul Buku yang ingin dihapus: ");
                        String judulHapus = input.nextLine();
                        boolean bukuDitemukan = false;
                        for (Buku buku : daftarBuku) {
                            if (buku.judul.equalsIgnoreCase(judulHapus)) {
                                daftarBuku.remove(buku);
                                System.out.println("Buku berhasil dihapus.");
                                bukuDitemukan = true;
                                break;
                            }
                        }
                        if (!bukuDitemukan) {
                            System.out.println("Buku tidak ditemukan.");
                        }
                        admin.liatBuku(daftarBuku);
                        break;
                    }
                    default:
                        System.out.println("Menu yang anda pilih tidak tersedia.");
                }
            } else {
                System.out.println("Pengguna tidak terdaftar.");
            }
        }
    }
}