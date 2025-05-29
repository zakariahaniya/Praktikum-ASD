package Jobsheet9;

public class StackTugasMahasiswa16 {
    Mahasiswa16[] stack;
    int top;
    int size;

    public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
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

    public void push(Mahasiswa16 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa16 pop() {
        if (!isEmpty()) {
            Mahasiswa16 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa16 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void jumlahTugas() {
        if (!isEmpty()) {
            System.out.println("Jumlah Tugas Terkumpul: " + (top + 1));
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi16 stack = new StackKonversi16();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
