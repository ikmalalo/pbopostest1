package com.mycompany.postestpbopraktikum1.models;

import java.time.LocalDate;

public class bagiansurat {
    private String namaTujuan;
    private String nikTujuan;
    private String noHp;
    private String alamatTujuan;
    private String emailTujuan;
    private String isiSurat;
    private String tanggalKirim;

    // Constructor
    public bagiansurat(String namaTujuan, String nikTujuan, String noHp, String alamatTujuan, String emailTujuan, String isiSurat) {
        this.namaTujuan = namaTujuan;
        this.nikTujuan = nikTujuan;
        this.noHp = noHp;
        this.alamatTujuan = alamatTujuan;
        this.emailTujuan = emailTujuan;
        this.isiSurat = isiSurat;
        this.tanggalKirim = LocalDate.now().toString(); // Mengambil tanggal hari ini
    }

    // Method untuk menampilkan surat
    public void tampilkanSurat() {
        System.out.println("\n=== Surat Anda ===");
        System.out.println("Nama Tujuan: " + namaTujuan);
        System.out.println("NIK Tujuan: " + nikTujuan);
        System.out.println("No.HP: " + noHp);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Email Tujuan: " + emailTujuan);
        System.out.println("Tanggal Kirim: " + tanggalKirim);
        System.out.println("Isi Surat: " + isiSurat);
        System.out.println("----------------------------------------");
    }
}
