package Jobsheet3;
import java.util.Scanner;
public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlahMk = sc.nextInt();
        System.out.println("------------------------------------");
        MataKuliah16[] arrayOfMataKuliah = new MataKuliah16[jumlahMk];
        String kode = null, nama = null, dummy = null;
        int sks = 0, jumlahJam = 0;

        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah[i] = new MataKuliah16(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, dummy, sks, jumlahJam, i);
        }
        
        arrayOfMataKuliah[0] = new MataKuliah16();

        arrayOfMataKuliah[0].kode = "123";
        arrayOfMataKuliah[0].nama = "Pemrograman Berorientasi";
        arrayOfMataKuliah[0].sks = 3;
        arrayOfMataKuliah[0].jumlahJam = 0;

        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah[i].cetakInfo(i);
        }
    }
}
