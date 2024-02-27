public class persegi {
    private double sisi;

    public persegi (double sisi) {
        this.sisi = sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}