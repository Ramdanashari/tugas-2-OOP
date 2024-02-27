public class App {
    public static void main (String[] args) {
        persegi kotak = new persegi(8);
        System.out.println("Luas Persegi: " + kotak.getLuas());
        System.out.println("Keliling Persegi: " + kotak.getKeliling());

        buku buku1 = new buku("ramdan", "cinderela", 25000, 1);
        buku buku2 = new buku("jamal", "legend of spartan", 35000, 2);

        double totalHarga = buku1.beliBuku(2) + buku2.beliBuku(3);
        System.out.println("Total Harga Semua Buku yang Dibeli: " + totalHarga);
    }
}
