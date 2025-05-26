package Jobsheet9;

public class Mahasiswa16 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa16() {

    }

    Mahasiswa16(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}