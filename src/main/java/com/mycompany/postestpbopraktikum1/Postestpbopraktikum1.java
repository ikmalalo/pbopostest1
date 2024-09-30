package com.mycompany.postestpbopraktikum1;

import com.mycompany.postestpbopraktikum1.models.bagiansurat;
import com.mycompany.postestpbopraktikum1.models.bagianpengguna;
import java.util.ArrayList;
import java.util.Scanner;

public class Postestpbopraktikum1 {

    static ArrayList<bagiansurat> daftarSurat = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            bagianpengguna pengguna = login(scanner);
            if (pengguna != null) {
                tampilanmenu(scanner, pengguna);
            }
        }
    }

    private static bagianpengguna login(Scanner scanner) {
        System.out.print("Masukkan Nama Anda Disini: ");
        String username = scanner.nextLine();
        System.out.print("Masukan Password Anda Disini: ");
        String password = scanner.nextLine();

        if (username.equals("ikmal") && password.equals("sigma")) {
            bagianpengguna pengguna = new bagianpengguna(username, password, "E-Surat Ikmal Ali Sigma");
            System.out.println("Login berhasil! Selamat Datang Di " + pengguna.getNamaLayanan());
            return pengguna;
        } else {
            System.out.println("Nama atau Password Anda salah. Coba Isi Yang Benar.");
            return null;
        }
    }

    private static void tampilanmenu(Scanner scanner, bagianpengguna pengguna) {
        while (true) {
            System.out.println("\n=== Menu E-Surat Ikmal Ali Sigma ===");
            System.out.println("1. Kirim Surat");
            System.out.println("2. Lihat Daftar Surat");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    kirimsurat(scanner, pengguna);
                    break;
                case 2:
                    lihatDaftarSurat();
                    break;
                case 3:
                    System.out.println("See you again homie.");
                    return;
                default:
                    System.out.println("Pilihan tidak ada, pilih pilihan yang benar.");
            }
        }
    }

    private static void kirimsurat(Scanner scanner, bagianpengguna pengguna) {
        while (true) {
            System.out.print("Nama Tujuan: ");
            String nama_tujuan = scanner.nextLine();
            System.out.print("NIK Tujuan: ");
            String nik_tujuan = scanner.nextLine();
            System.out.print("No.HP: ");
            String noHp = scanner.nextLine();
            System.out.print("Alamat Tujuan: ");
            String alamat_tujuan = scanner.nextLine();
            System.out.print("Email Tujuan: ");
            String email_tujuan = scanner.nextLine();
            System.out.print("Tulis Isi Surat yang ingin anda sampaikan: ");
            String letterContent = scanner.nextLine();

            bagiansurat surat = new bagiansurat(nama_tujuan, nik_tujuan, noHp, alamat_tujuan, email_tujuan, letterContent);
            daftarSurat.add(surat);

            surat.tampilkanSurat();
            System.out.println("Surat Sudah berhasil dikirim!");

            System.out.print("Ingin mengirim surat lagi? (ya/tidak): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("ya")) {
                break; 
            }
        }
    }

    private static void lihatDaftarSurat() {
        System.out.println("\n=== Daftar Surat ===");

        for (bagiansurat surat : daftarSurat) {
            surat.tampilkanSurat();
        }
        System.out.println("-------------------");
    }
}
