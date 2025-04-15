package Jobsheet6;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }

    int[] DataSequential16(String cari) {
        int[] hasil = new int[idx];
        int posisi = 0;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) {
                hasil[posisi] = j;
                posisi++;
            }
        }
        if (posisi == 0) {
            return new int[0];
        }
        int[] hasilFix = new int[posisi];
        for (int i = 0; i < posisi; i++) {
            hasilFix[i] = hasil[i];
        }
        return hasilFix;
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data dosen dengan nama : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilPosisi2(int x, int pos) {
        if (pos != -1) {
            System.out.println("data dosen dengan usia : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + x);
            System.out.println("jenis kelamin\t : " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("usia\t : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch2(int x, int pos) {
        if (pos != -1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + dataDosen[pos].nama);
            System.out.println("jenis kelamin\t : " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("usia\t : " + x);
        } else {
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }

    int[] PencarianDataBinery16(int cari) {
        SortingASC();
        int left = 0;
        int right = idx -1;
        int foundidx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == cari) {
                foundidx = mid;
                break;
            } else if (dataDosen[mid].usia < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (foundidx == -1) {
            return new int[0];
        }
        int start = foundidx;
        int end = foundidx;
        while (start > 0 && dataDosen[start - 1].usia == cari) {
            start--;
        }
        while (end < idx - 1 && dataDosen[end + 1].usia == cari) {
            end++;
        }
        int[] result = new int[end - start + 1];
        for (int i = 0; i < result.length; i++) {
        result[i] = start + i;
        }
        return result;
    }
}
