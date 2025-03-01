package Jobsheet3;
import java.util.Scanner;
public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen yang akan diinput : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        System.out.println("--------------------------------------------");
        Dosen16[] arrayOfDosen = new Dosen16[jumlahDosen];
        String kode, nama, dummy, stringJenisKelamin;
        Boolean jenisKelamin = false;
        int usia;
        DataDosen16 dataDosen16 = new DataDosen16();

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.next();
            sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            stringJenisKelamin = sc.next();
            sc.nextLine();
            if (stringJenisKelamin.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else if (stringJenisKelamin.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            dummy = sc.next();
            sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------");
            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }

        int i = 0;
        for (Dosen16 dosen16 : arrayOfDosen) {
            dosen16.tampilkanInfo(i);
            i++;
        }

        for (int j = 0; j < jumlahDosen; j++) {
            dataDosen16.dataSemuaDosen(arrayOfDosen[j], j);
        }

        dataDosen16.jumlahDosenPerJenisKelamin();
        dataDosen16.rerataUsiaDosenperJenisKelamin();
        dataDosen16.infoDosenPalingTua();
        dataDosen16.infoDosenPalingMuda();
    }
}
