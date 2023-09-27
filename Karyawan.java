/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.posttest_1;

/**
 *
 * @author Muhammad Ardan Darmawan
 */
public class Karyawan {
    private final String nama;
    private final String jabatan;
    private final int tahunMasuk;

    public Karyawan(String nama, String jabatan, int tahunMasuk) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.tahunMasuk = tahunMasuk;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "nama='" + nama + '\'' +
                ", jabatan='" + jabatan + '\'' +
                ", tahunMasuk=" + tahunMasuk +
                '}';
    }
}
