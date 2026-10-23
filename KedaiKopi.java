public class KedaiKopi {
    public static void main(String[] args) {

        String nama="Budi";
        int jumlah_kopi=4;
        int jumlah_donat=2;
        int harga_kopi=18500;
        int harga_donat=5000;
        int diskon = 2000;
        double ppn = 0.11;

        int harga_total = (jumlah_donat*harga_donat) + (jumlah_kopi*harga_kopi);
        double total_pajak = harga_total * ppn;
        double total_akhir= harga_total + total_pajak - diskon;

        System.out.println("################################");
        System.out.println("Nama Pelanggan      : "+nama);
        System.out.println("Kopi Susu gula aren : Rp."+harga_kopi+"*"+jumlah_kopi);
        System.out.println("Donat               : Rp."+harga_donat+"*"+jumlah_donat);
        System.out.println("biaya pajak         : Rp. "+total_pajak);
        System.out.println("Total Belanjaan     : Rp. "+total_akhir);
        System.out.println("################################");
    }
}
