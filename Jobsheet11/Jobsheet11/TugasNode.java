package Jobsheet11;

public class TugasNode {
    TugasMahasiswa data;
    TugasNode next;

    TugasNode(TugasMahasiswa data, TugasNode next) {
        this.data = data;
        this.next = next;
    }
}
