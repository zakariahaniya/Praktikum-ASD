package Jobsheet11;
import java.util.Scanner;
public class SLLMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList16 sll = new SingleLinkedList16();

        boolean lanjut = true;

        Mahasiswa16 mhs1 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa16 mhs2 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);
        Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        do {
            System.out.print("Lanjut (y/n): ");
            String next = sc.nextLine();
            if(next.equalsIgnoreCase("y")){
                lanjut= true;
            }else{
                lanjut = false;
                System.out.println("Anda telah Keluar.");
                System.out.println("Data saat ini:");
                sll.print();
                break;
            }
            System.out.println("Data saat ini:");
            sll.print();
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Tambah Data Setelah Nama Tertentu");
            System.out.println("4. Tambah Data di Indeks Tertentu");
            System.out.print("Pilih menu: ");
            int menu = Integer.parseInt(sc.nextLine());
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ip = Double.parseDouble(sc.nextLine());
            Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ip);
            switch (menu) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan Nama Setelah: ");
                    String namaAfter = sc.nextLine();
                    sll.insertAfter(namaAfter, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan Indeks: ");
                    int index = Integer.parseInt(sc.nextLine());
                    sll.insertAt(index, mhs);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (lanjut);
    }
}
