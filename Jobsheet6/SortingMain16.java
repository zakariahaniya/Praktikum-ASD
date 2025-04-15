package Jobsheet6;

public class SortingMain16 {
    public static void main(String[] args) {
        int a [] = {20, 10, 2, 7, 12};

        Sorting16 dataurut1 = new Sorting16(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b [] = {30, 20, 2, 8, 14};

        Sorting16 dataurut2 = new Sorting16(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c [] = {40, 10, 4, 9, 3};

        Sorting16 dataurut3 = new Sorting16(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
