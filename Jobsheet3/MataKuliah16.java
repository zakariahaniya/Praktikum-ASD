package Jobsheet3;
import java.util.Scanner;

public class MataKuliah16 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    Scanner sc = new Scanner(System.in);

    public MataKuliah16(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah16() {

    }

    void tambahData(String kode, String nama,String dummy, int sks, int jumlahJam, int i) {
        System.out.println("Masukkan Data Mata Kuliah Ke-" + (i + 1));
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        dummy = sc.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
        System.out.println("--------------------------------");
    }

    void cetakInfo(int i) {
        System.out.println("Data Mata Kuliah ke-" + (i + 1));
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("---------------------------------");
    }
}
