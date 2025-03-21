package Kuis1;

public class AtletMain {
    Atlet[] arrayOfAtlet = new Atlet[3];
    String nama;
    int umur;
    double beratBadan;
    double tinggiBadan;

    arrayOfAtlet[0] = new Atlet("Andra", 25, 68, 1.75);
    arrayOfAtlet[1] = new Atlet("Bintang", 30, 85, 1.80);
    arrayOfAtlet[2] = new Atlet("Dila", 28, 95, 1.70);

    for (i = 0, i < 3, i++) {
        arrayOfAtlet[i].tampilkanInformasi();
    }
}
