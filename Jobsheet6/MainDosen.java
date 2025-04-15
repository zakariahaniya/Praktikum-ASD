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
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Cari Dosen Berdasarkan Usia");
            System.out.println("5. Sorting ASC (Bubble Sort - Usia Muda ke Tua)");
            System.out.println("6. Sorting DSC (Selection Sort - Usia Tua ke Muda)");
            System.out.println("7. Insertion Sort (Usia Tua ke Muda)");
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
                    System.out.println("Pencarian data");
                    System.out.print("masukkan nama dosen yang dicari : ");
                    String cari = sc.nextLine();
                    System.out.println("menggunakan sequential searching");
                    int[] hasil = data.DataSequential16(cari);
                    if (hasil.length == 1 && hasil[0] == -1) {
                        System.out.println("Data dosen dengan nama '" + cari + "' tidak ditemukan.");
                    } else {
                        if (hasil.length > 1) {
                            System.out.println("PERINGATAN: Ditemukan lebih dari satu dosen dengan nama '" + cari + "'.");
                        }
                
                        for (int pos : hasil) {
                            data.tampilPosisi(cari, pos);
                            data.tampilDataSearch(cari, pos);
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pencarian data");
                    System.out.print("masukkan usia dosen yang dicari : ");
                    int search = sc.nextInt();
                    sc.nextLine();
                    System.out.println("menggunakan binary search");
                    int[] posisiArr = data.PencarianDataBinery16(search);
                    if (posisiArr.length == 0) {
                        System.out.println("Data dosen dengan usia \" + searchUsia + \" tidak ditemukan.");
                    } else {
                        if (posisiArr.length > 1) {
                            System.out.println("PERINGATAN: Ditemukan lebih dari satu dosen dengan usia " + search + ".");
                        }
                        for (int pos : posisiArr) {
                            data.tampilPosisi2(search, pos);
                            data.tampilDataSearch2(search, pos);
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                case 5:
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC.");
                    break;
                case 6:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC.");
                    break;
                case 7:
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
