package Jobsheet3;
import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa16[] arrayofMahasiswa = new Mahasiswa16[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa16();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofMahasiswa[i].cetakInfo();
        }

        Mahasiswa16[] myArrayOfMahasiswa = new Mahasiswa16[3];

        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;
    }
}
