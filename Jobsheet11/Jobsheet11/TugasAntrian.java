package Jobsheet11;

public class TugasAntrian {
    TugasNode front;
    TugasNode rear;
    int size;

    public TugasAntrian() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void tampilSemua() {
        if (!isEmpty()) {
            TugasNode tmp = front;
            System.out.println("Isi Antrian:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih Kosong!");
        }
    }

    public void Enqueue(TugasMahasiswa mhs) {
        TugasNode newMhs = new TugasNode(mhs, null);
        if (rear == null) {
            front = rear = newMhs;
        } else {
            rear.next = newMhs;
            rear = newMhs;    
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan dalam antrian!");
    }


    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Memanggil mahasiswa: ");
            front.data.tampilInformasi();
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        size--;
    }

    public void tampilTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Mahasiswa paling depan adalah: ");
            front.data.tampilInformasi();
        }
    }

    public void tampilTerbelakang() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Mahasiswa paling belakang adalah: ");
            rear.data.tampilInformasi();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah Mahsiswa dalam antrian: " + size);
    }
}
