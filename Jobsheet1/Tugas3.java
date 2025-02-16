package Jobsheet1;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.next();
            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.next();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = sc.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalHari(String[] nama, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + cariHari.toUpperCase() + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari);
        }
    }

    public static void tampilkanJadwalSemester(String[] nama, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + cariSemester + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + cariSemester);
        }
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cariNama) {
        System.out.println("\n=== HASIL PENCARIAN MATA KULIAH ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.println("Nama: " + nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + cariNama + " tidak ditemukan.");
        }
    }
}
