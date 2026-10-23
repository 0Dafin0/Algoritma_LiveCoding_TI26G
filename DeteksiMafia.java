import java.util.Scanner;

public class DeteksiMafia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tempat Tinggal : ");
        String tempatTinggal = input.nextLine();
        System.out.print("Uang Tabungan : ");
        int uangTabungan = input.nextInt();

        if ((umur > 40) && (tempatTinggal.equalsIgnoreCase("Nevada") ||
        tempatTinggal.equalsIgnoreCase("New York") ||
        tempatTinggal.equalsIgnoreCase("Havana"))
        && (uangTabungan > 10000000)){
            System.out.print(nama+" Kemungkinan adalah seorang anggota mafia dengan pangkat Don");
        }
        else if ((umur >= 25 && umur <= 40) && (tempatTinggal.equalsIgnoreCase("New Jersey") ||
        tempatTinggal.equalsIgnoreCase("Manhattan") ||
        tempatTinggal.equalsIgnoreCase("Nevada")) && (uangTabungan >= 1000000 && uangTabungan <=2000000)){
            System.out.print(nama+" Kemungkinan adalah seorang anggota mafia dengan pangkat Underboss");
        }
        else if ((umur >= 18 && umur <= 24) && (tempatTinggal.equalsIgnoreCase("California") ||
        tempatTinggal.equalsIgnoreCase("Detroit") ||
        tempatTinggal.equalsIgnoreCase("Boston")) && (uangTabungan >= 0 && uangTabungan < 1000000)){
            System.out.print(nama+" Kemungkinan adalah seorang anggota mafia dengan pangkat Capo");
        }
        else{
            System.out.print(nama+" tidak mencurigakan");
        }
        
    }
}
