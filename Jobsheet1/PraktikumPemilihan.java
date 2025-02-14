package Jobsheet1;
import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas = 0, kuis = 0, uts = 0, uas = 0, nilaiAkhir;
        String nilaiHuruf = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = sc.nextDouble();
        System.out.println("======================");
        System.out.println("======================");
        if ((nilaiTugas < 0) || (nilaiTugas > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        } else if ((kuis < 0) || (kuis > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        } else if ((uts < 0) || (uts > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        } else if ((uas < 0) || (uas > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        }
        nilaiAkhir = (nilaiTugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        if (80 < nilaiAkhir && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        }else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");
        if ((nilaiHuruf == "D") || (nilaiHuruf == "E")) {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}