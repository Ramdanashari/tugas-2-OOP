public class buku {
    private String penulis;
    private String judul;
    private double harga;
    private double totalHarga;
    private int nomorPenerbit;

    public buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public int getNomorPenerbit() {
        return nomorPenerbit;
    }

    public double beliBuku(int jumlahBukuYangDibeli) {
        this.totalHarga = jumlahBukuYangDibeli * harga;
        System.out.println("Membeli buku " + judul + " sebanyak " + jumlahBukuYangDibeli);
        return totalHarga;
    }
}
