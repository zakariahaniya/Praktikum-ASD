package Jobsheet1;

public class PraktikumFungsi {
    // Harga setiap jenis bunga
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;
    
    // Data stock bunga di cabang RoyalGarden
    static int[][] stokBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };
    
    // Fungsi untuk menghitung pendapatan setiap cabang jika semua bunga terjual
    public static void hitungPendapatan() {
        System.out.println("Pendapatan tiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = (stokBunga[i][0] * HARGA_AGLONEMA) +
                             (stokBunga[i][1] * HARGA_KELADI) +
                             (stokBunga[i][2] * HARGA_ALOCASIA) +
                             (stokBunga[i][3] * HARGA_MAWAR);
    
            System.out.println("RoyalGarden " + (i + 1) + " : Rp " + pendapatan);
        }
    }
    
    // Fungsi untuk menampilkan total stok setiap jenis bunga
    public static void totalStokBunga() {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
    
        for (int i = 0; i < stokBunga.length; i++) {
            totalAglonema += stokBunga[i][0];
            totalKeladi += stokBunga[i][1];
            totalAlocasia += stokBunga[i][2];
            totalMawar += stokBunga[i][3];
        }
    
        System.out.println("\nTotal stok bunga di semua cabang:");
        System.out.println("Aglonema  : " + totalAglonema);
        System.out.println("Keladi    : " + totalKeladi);
        System.out.println("Alocasia  : " + totalAlocasia);
        System.out.println("Mawar     : " + totalMawar);
    }
    
    // Fungsi untuk mengurangi stok bunga yang mati
    public static void kurangiStokBungaMati() {
        int[] bungaMati = {-1, -2, 0, -5}; // Pengurangan stok sesuai tabel
    
        for (int i = 0; i < stokBunga[3].length; i++) {
            stokBunga[3][i] += bungaMati[i]; // Mengurangi stok bunga di RoyalGarden 4
        }
    
        System.out.println("\nStok di RoyalGarden 4 setelah pengurangan bunga mati:");
        System.out.println("Aglonema  : " + stokBunga[3][0]);
        System.out.println("Keladi    : " + stokBunga[3][1]);
        System.out.println("Alocasia  : " + stokBunga[3][2]);
        System.out.println("Mawar     : " + stokBunga[3][3]);
    }    
    public static void main(String[] args) {
        hitungPendapatan();     // Menampilkan pendapatan setiap cabang
        totalStokBunga();       // Menampilkan total stok bunga
        kurangiStokBungaMati(); // Mengurangi stok bunga mati di RoyalGarden 4
    }
}
