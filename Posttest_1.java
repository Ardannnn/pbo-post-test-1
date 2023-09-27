/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.posttest_1;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Ardan Darmawan
 */


public class Posttest_1 {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        // Menambahkan karyawan ke ArrayList
        daftarKaryawan.add(new Karyawan("Alice", "Manajer", 2010));
        daftarKaryawan.add(new Karyawan("Bob", "Pengembang", 2015));
        daftarKaryawan.add(new Karyawan("Charlie", "Pemasaran", 2018));
        daftarKaryawan.add(new Karyawan("David", "Desainer", 2017));
        daftarKaryawan.add(new Karyawan("Eve", "Pengembang", 2019));

        // Menampilkan daftar karyawan
        System.out.println("Daftar Karyawan di Perusahaan:");
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println(karyawan);
        }
    }
}
