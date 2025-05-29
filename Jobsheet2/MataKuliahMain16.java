package Jobsheet2;

public class MataKuliahMain16 {
    public static void main(String[] args) {
        MataKuliah16 mk1 = new MataKuliah16();
        mk1.nama = "Praktek Algoritma dan Struktur Data";
        mk1.kodeMK = "123456789";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(4);
        mk1.kurangJam(5);
        mk1.tampilInformasi();

        MataKuliah16 mk2 = new MataKuliah16("Algoritma dan Struktur Data", "123456789", 3, 5);
        mk2.tampilInformasi();
        mk2.ubahSKS(1);
        mk2.tambahJam(1);
        mk2.kurangJam(10);
        mk2.tampilInformasi();
    }
}
