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
public class NilaiAkhir extends Mahasiswa {
    int uts, uas, tugas;
    
    public NilaiAkhir (String nama, String npm, int uts, int uas, int tugas) {
        this.nama= nama;
        this.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
        
    }
    
    double hitungNilaiAkhir () {
        return (0.30 * uts) + (0.30*uas) + (0.40 * tugas);
    }
}
