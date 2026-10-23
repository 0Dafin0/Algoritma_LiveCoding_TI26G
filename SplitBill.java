public class SplitBill {
    public static void main(String[] args) {
        int harga_pesanan = 345000;
        double charge = 0.05;
        int uang_tip = 20000;
        int jumlah_orang = 5;

        double biaya_layanan = harga_pesanan * charge;
        double total_pesanan = harga_pesanan + biaya_layanan + uang_tip;
        double split_bill = total_pesanan / jumlah_orang;

        System.out.println("Total Pesanan : " + total_pesanan);
        System.out.println("Nominal yang harus dibayar per orang : " + split_bill);
    }
}
