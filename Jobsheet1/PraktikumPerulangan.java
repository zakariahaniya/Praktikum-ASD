package Jobsheet1;
import java.util.Scanner;
public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
        char digit1, digit2;
        int n;
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        digit1 = nim.charAt(nim.length() - 2);
        digit2 = nim.charAt(nim.length() - 1);
        n = Integer.parseInt(String.valueOf(digit1)) * 10 + Integer.parseInt(String.valueOf(digit2));
        if (n < 10) {
            n = n + 10;
        }
        System.out.println("========================");
        System.out.println("n : " + n);
        System.out.print("Output : ");
        for (int i = 1; i <= n; i++) {
            if ((i == 6) || (i == 10)) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
