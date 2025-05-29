package Kuis1;

public class Atlet {
    String nama16;
    int umur16;
    double beratBadan16;
    double tinggiBadan16;

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama16);
        System.out.println("Umur : " + umur16);
        System.out.println("Tinggi : " + tinggiBadan16 + " m");
        System.out.println("Berat : " + beratBadan16 + " kg");
        System.out.println("");
    }

    void cekKategori() {
        
    }

    public Atlet(String nama16, int umur16, double beratBadan16, double tinggiBadan16) {
        this.nama16 = nama16;
        this.umur16 = umur16;
        this.beratBadan16 = beratBadan16;
        this.tinggiBadan16 = tinggiBadan16;
    }
}
