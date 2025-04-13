package Jobsheet6;
import java.util.Scanner;
public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Selection Sort - Usia Tua ke Muda)");
            System.out.println("5. Insertion Sort (Usia Tua ke Muda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data.tambah(new Dosen(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC.");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan dengan Insertion Sort.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
