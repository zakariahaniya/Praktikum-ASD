package Jobsheet2;

import java.time.LocalDate;

public class Dosen16 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung + " Tahun");
        System.out.println("Masa Kerja : " + hitungMasaKerja(LocalDate.now().getYear()) + " Tahun");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen16() {

    }

    public Dosen16(String nama, String id, String bidang, boolean status, int tahun) {
        this.nama = nama;
        idDosen = id;
        bidangKeahlian = bidang;
        statusAktif = status;
        tahunBergabung = tahun;
    }
}
