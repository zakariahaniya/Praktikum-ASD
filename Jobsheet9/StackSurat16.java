package Jobsheet9;

public class StackSurat16 {
    Surat16[] stack;
    int size;
    int top;

    StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;  
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;  
        }
    }

    public void push(Surat16 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat lagi.");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diambil.");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang bisa dilihat.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println("Nama\tID Surat\tkelas\tJenis Izin\t Durasi");
            if (stack[i].jenisIzin == 's' || stack[i].jenisIzin == 'S') {
                System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].idSurat + "\t" + stack[i].kelas + "\t" + "Sakit" + "\t" + stack[i].durasi);
            }
            if (stack[i].jenisIzin == 'i' || stack[i].jenisIzin == 'I') {
                System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].idSurat + "\t" + stack[i].kelas + "\t" + "Izin" + "\t" + stack[i].durasi);
            }
        }
        System.out.println("");
    }
}
