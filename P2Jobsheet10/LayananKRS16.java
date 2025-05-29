package P2Jobsheet10;
import java.util.Scanner;
public class LayananKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS16 antrian = new AntrianKRS16(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Tampil 2 Antrian Terdepan");
            System.out.println("4. Tampil Antrian Belakang");
            System.out.println("5. Tampil Semua Antrian");
            System.out.println("6. Jumlah Antrian tersisa");
            System.out.println("7. Jumlah yang sudah melakukan KRS");
            System.out.println("8. Jumlah yang belum melakukan KRS");
            System.out.println("9. Mengosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    System.out.print("Memproses mahasiswa: ");
                    for (int i = 0; i < 2; i++) {
                        Mahasiswa dilayani = antrian.layaniMahasiswa();
                        if (dilayani != null) {
                            dilayani.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mahasiswa terdepan: ");
                    System.out.println("NIM - NAMA - PRODI - KELAS");
                    antrian.lihat2Terdepan();
                    break;
                case 4:
                    antrian.lihatTerbelakang();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian tersisa: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah melakukan KRS: " + antrian.jmlSudahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah yang belum melakukan KRS: " + antrian.jmlBelumKRS());
                    break;
                case 9:
                    antrian.kosongkanAntrian();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0 && pilihan <= 9);
        sc.close();
    }
}
