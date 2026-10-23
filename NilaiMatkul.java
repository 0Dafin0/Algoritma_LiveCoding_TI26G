public class NilaiMatkul {
public static void main(String[] args) {
        String nama = "Siti";
        String nim = "2024001";
        int nilai_tugas = 85;
        int nilai_uts = 78;
        int nilai_uas = 90;
        double bobot_tugas = 0.3;
        double bobot_uts = 0.3;
        double bobot_uas = 0.4;

        double nilai_akhir = (nilai_tugas * bobot_tugas) + (nilai_uts * bobot_uts) + (nilai_uas * bobot_uas);

        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Nilai Akhir : " + nilai_akhir);
    }
}
