package UTSpraktikum;

abstract class Kamar {
    protected int nomorKamar;
    protected String namaPenyewa;
    protected boolean tersedia;

    public Kamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.tersedia = true;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public void dipesan(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
        this.tersedia = false;
        System.out.println("\nKamar " + nomorKamar + " berhasil dipesan oleh " + namaPenyewa);
    }

    public void batalkanPesanan() {
        this.namaPenyewa = null;
        this.tersedia = true;
        System.out.println("\nPesanan untuk kamar " + nomorKamar + " telah dibatalkan.");
    }

    public void lihatPesanan() {
        if (!tersedia) {
            System.out.println("|    " + nomorKamar + "     | " + this.getClass().getSimpleName() + " |  " + namaPenyewa + "  |");
        } else {
            System.out.println("|    " + nomorKamar + "     | " + this.getClass().getSimpleName() + " |   -    |");
        }
    }

    public void lihatKetersediaan() {
        System.out.println("Kamar " + nomorKamar + " (" + this.getClass().getSimpleName() + ") : " + (tersedia ? "Tersedia" : "Dipesan"));
    }
}