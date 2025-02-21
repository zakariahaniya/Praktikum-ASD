package Jobsheet2;

public class MataKuliah16 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
        }
    }

    public MataKuliah16() {

    }

    public MataKuliah16(String nama, String kode, int sks, int jumlahJam) {
        this.nama = nama;
        kodeMK = kode;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
