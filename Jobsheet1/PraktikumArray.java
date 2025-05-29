package Jobsheet1;
import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nilaiHurufArray = {"A", "B+", "B", "C+", "C", "D", "E"};
        double[] nilaiSetaraArray = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0};
        System.out.println("=================================");
        System.out.println("   Program Menghitung IP Semester");
        System.out.println("=================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        int[] sks = new int[jumlahMK];
        double totalBobotNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            if (nilaiAngka[i] > 80) nilaiHuruf[i] = "A";
            else if (nilaiAngka[i] > 73) nilaiHuruf[i] = "B+";
            else if (nilaiAngka[i] > 65) nilaiHuruf[i] = "B";
            else if (nilaiAngka[i] > 60) nilaiHuruf[i] = "C+";
            else if (nilaiAngka[i] > 50) nilaiHuruf[i] = "C";
            else if (nilaiAngka[i] > 39) nilaiHuruf[i] = "D";
            else nilaiHuruf[i] = "E";
            double nilaiSetara = 0;
            for (int j = 0; j < nilaiHurufArray.length; j++) {
                if (nilaiHuruf[i].equals(nilaiHurufArray[j])) {
                    nilaiSetara = nilaiSetaraArray[j];
                    break;
                }
            }
            bobotNilai[i] = nilaiSetara * sks[i];
            totalBobotNilai += bobotNilai[i];
            totalSKS += sks[i];
        }
        double ipSemester = (totalSKS == 0) ? 0 : totalBobotNilai / totalSKS;
        System.out.println("\n=================================");
        System.out.println("       Hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.printf("%-30s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("=================================");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
    }
}
