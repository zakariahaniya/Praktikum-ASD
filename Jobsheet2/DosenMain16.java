package Jobsheet2;

public class DosenMain16 {
    public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16();
        dosen1.nama = "Bapak";
        dosen1.idDosen = "1234";
        dosen1.bidangKeahlian = "Kepemimpinan";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1945;

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kebijaksanaan");
        dosen1.tampilInformasi();

        Dosen16 dosen2 = new Dosen16("Ibu", "5678", "Keadilan", false, 2020);
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Kebenaran");
        dosen2.tampilInformasi();
    }
}
