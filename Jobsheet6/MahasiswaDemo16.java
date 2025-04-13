package Jobsheet6;
import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        for (int i = 0; i < 5; i++) {
            Mahasiswa16 m = new Mahasiswa16();
            m.inputMhs(i);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

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
