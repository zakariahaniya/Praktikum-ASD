package Jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16(jumMhs);
        for (int i = 0; i < jumMhs; i++) {
            Mahasiswa16 m = new Mahasiswa16();
            m.inputMhs(i);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting :");
        list.tampil();

        //melakukan pencarian data sequential
        System.out.println("---------------------------------------------------");
        System.out.println("Pemcarian data");
        System.out.println("---------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        String search = sc.nextLine();
        double cari = Double.parseDouble(search);
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("-------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        search = sc.nextLine();
        cari = Double.parseDouble(search);
         System.out.println("------------------------------------");
         System.out.println("menggunakan binary search");
         System.out.println("------------------------------------");
         double posisi2 = list.findBinerySearch(cari, 0, list.listMhs.length - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) :");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC) :");
        list.insertionSort();
        list.tampil();
    }
}
