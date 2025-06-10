package Jobsheet11;
import java.util.Scanner;
public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasAntrian antrian = new TugasAntrian();
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN LAYANAN KEMAHASISWAAN =====");
            System.out.println("1. Tambahkan Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Mahasiswa Terdepan");
            System.out.println("6. Tampilkan Mahasiswa Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    double ipk = sc.nextDouble();
                    TugasMahasiswa mhs = new TugasMahasiswa(nama, nim, kelas, ipk);
                    antrian.Enqueue(mhs);
                    break;

                case 2:
                    antrian.Dequeue();                
                    break;
                
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 4:
                    antrian.clear();
                    break;

                case 5:
                    antrian.tampilTerdepan();
                    break;

                case 6:
                    antrian.tampilTerbelakang();
                    break;

                case 7:
                    antrian.jumlahAntrian();
                    break;

                case 8:
                    antrian.tampilSemua();
                    break;

                case 9:
                    System.out.println("Terima kasih");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Pilih kembali (1-9)");
                    break;
            }
        } while (pilihan >= 1 && pilihan <= 9);
    }
}
