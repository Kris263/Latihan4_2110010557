/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author krist
 */
public class Main {
    public static void main(String[] args) {
        NilaiAkhir  kris = new NilaiAkhir ("Kristian", "2110010557", 90, 100, 80);
        
        System.out.println("Nama = "+ kris.nama);
        System.out.println("NPM = "+ kris.npm);
        System.out.println("Hasil Ujian = " +kris.hitungNilaiAkhir());
    }
}
