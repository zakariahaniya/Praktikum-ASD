package Jobsheet3;

public class DataDosen16 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia, j = 0, jumlahDosenPria = 0, jumlahDosenWanita = 0, usiaTermuda = 100, usiaTertua = 0;
    double totalUsiaDosenPria, totalUsiaDosenWanita;

    void dataSemuaDosen(Dosen16 dosen, int j) {
        System.out.println("Data Dosen Ke-" + (1 + j));
        System.out.println("Kode          : " + dosen.kode);
        System.out.println("Nama          : " + dosen.nama);
        System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + dosen.usia);
        if (dosen.jenisKelamin == true) {
            jumlahDosenPria++;
            totalUsiaDosenPria += dosen.usia;
        } else {
            jumlahDosenWanita++;
            totalUsiaDosenWanita += dosen.usia;
        }
        if (dosen.usia > usiaTertua) {
            usiaTertua = dosen.usia;
        }
        if (dosen.usia < usiaTermuda) {
            usiaTermuda = dosen.usia;
        }
        System.out.println("---------------------------------");
    }

    void jumlahDosenPerJenisKelamin() {
        System.out.println("Jumlah Dosen Pria   : " + jumlahDosenPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahDosenWanita);
        System.out.println("---------------------------------");
    }

    void rerataUsiaDosenperJenisKelamin() {
        double rerataUsiaDosenPria = totalUsiaDosenPria / jumlahDosenPria;
        double rerataUsiaDosenWanita = totalUsiaDosenWanita / jumlahDosenWanita;
        System.out.println("Rata-rata Usia Dosen Pria   : " + rerataUsiaDosenPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rerataUsiaDosenWanita);
        System.out.println("---------------------------------");
    }

    void infoDosenPalingTua() {
        System.out.println("Usia Dosen Paling Tua : " + usiaTertua);
        System.out.println("---------------------------------");
    }

    void infoDosenPalingMuda() {
        System.out.println("Usia Dosen Paling Muda : " + usiaTermuda);
        System.out.println("---------------------------------");
    }
}
