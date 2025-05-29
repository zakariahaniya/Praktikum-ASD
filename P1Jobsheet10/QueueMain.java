package P1Jobsheet10;
import java.util.Scanner;
public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang ingin dimasukkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        sc.nextLine();
        Queue Q = new Queue(n);
        int pilih;
        boolean stop = false;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    if (!Q.Enqueue(dataMasuk)) {
                        System.out.println("Program dihentikan karena queue penuh.");
                        stop = true;
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar == Integer.MIN_VALUE) {
                        System.out.println("Program dihentikan karena queue kosong.");
                        stop = true;
                    } else {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while ((pilih >= 1 && pilih <= 5) && !stop);
    }
}
