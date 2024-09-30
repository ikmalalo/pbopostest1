package com.mycompany.postestpbopraktikum1.models;

public class bagianpengguna {
    private String username;
    private String password;
    private String namaLayanan;

    // Constructor
    public bagianpengguna(String username, String password, String namaLayanan) {
        this.username = username;
        this.password = password;
        this.namaLayanan = namaLayanan;
    }

    // Getter untuk nama layanan
    public String getNamaLayanan() {
        return namaLayanan;
    }

    // Metode tambahan jika dibutuhkan
    public void tampilkanInfoPengguna() {
        System.out.println("Username: " + username);
        System.out.println("Layanan: " + namaLayanan);
    }
}
