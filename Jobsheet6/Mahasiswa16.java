package Jobsheet6;
import java.util.Scanner;
public class Mahasiswa16 {
    Scanner sc = new Scanner(System.in);
    String nim;
    String nama;
    String kelas;
    double ipk;

    //Konstruktor default
    Mahasiswa16() {

    }

    //Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa16(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void inputMhs(int i) {
        System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        System.out.print("NIM   : ");
        nama = sc.nextLine();
        System.out.print("Nama  : ");
        nim = sc.nextLine();
        System.out.print("Kelas : ");
        kelas = sc.nextLine();
        System.out.print("IPK   : ");
        String ip = sc.nextLine();
        ipk = Double.parseDouble(ip);
        System.out.println("---------------------------------");
    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
