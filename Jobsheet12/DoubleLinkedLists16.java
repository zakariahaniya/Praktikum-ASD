package Jobsheet12;

public class DoubleLinkedLists16 {
    Node16 head;
    Node16 tail;

    public DoubleLinkedLists16() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa16 data) {
        Node16 newNode16 = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode16;
        } else {
            newNode16.next = head;
            head.prev = newNode16;
            head = newNode16;
        }
    }

    public void addLast(Mahasiswa16 data) {
        Node16 newNode16 = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode16;
        } else {
            tail.next = newNode16;
            newNode16.prev = tail;
            tail = newNode16;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa16 data) {
        Node16 current = head;

        //Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node16 newNode16 = new Node16(data);

        //Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode16;
            newNode16.prev = current;
            tail = newNode16;
        } else {
            //Sisipkan di tengah
            newNode16.next = current.next;
            newNode16.prev = current;
            current.next.prev = newNode16;
            current.next = newNode16;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        Node16 current = head;
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.!");
        }
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak dapat menghapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: NIM: " + head.data.nim + ", Nama: " + head.data.nama + ", Kelas: " + head.data.kelas + ", IPK: " + head.data.ipk);
            head = tail = null;
        } else {
            head = head.next;
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: NIM: " + head.prev.data.nim + ", Nama: " + head.prev.data.nama + ", Kelas: " + head.prev.data.kelas + ", IPK: " + head.prev.data.ipk);
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak dapat menghapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: NIM: " + head.data.nim + ", Nama: " + head.data.nama + ", Kelas: " + head.data.kelas + ", IPK: " + head.data.ipk);
            head = tail = null;
        } else {
            tail = tail.prev;
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: NIM: " + tail.next.data.nim + ", Nama: " + tail.next.data.nama + ", Kelas: " + tail.next.data.kelas + ", IPK: " + tail.next.data.ipk);
            tail.next = null;
        }
    }

    public Node16 search(String nim) {
        Node16 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa16 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node16 newNode = new Node16(data);
            Node16 current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen, menambahkan di akhir.");
                addLast(data);
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode; 
                }
                current.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim) {
        Node16 current = head;
        if (isEmpty()) {
        System.out.println("List kosong. Tidak ada yang bisa dihapus.");
        return;
        }
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next != null) {
            Node16 removeAfter = current.next;
            current.next = removeAfter.next;
            if (removeAfter.next != null) {
                removeAfter.next.prev = current;
            } else {
                tail = current; 
            }
            System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
        } else {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
        }
    }

    public void remove(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node16 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah data yang ada, tidak ada yang dihapus.");
                return;
            }
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            tail.data.tampil();
        }
    }

    public int getIndex(String nim) {
        Node16 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nama.equals(nim)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int getSize() {
        Node16 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
