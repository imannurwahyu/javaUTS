package UTSpraktikum;
import java.util.*;

class Hotel {
    private String namaHotel;
    private Kamar kamar1;
    private Kamar kamar2;
    private Kamar kamar3;

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
        kamar1 = new KamarStandard(1);
        kamar2 = new KamarVIP(2);
        kamar3 = new KamarVVIP(3);
    }
    
    public void pesanKamar() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan Nama Tamu: ");
        String nama = input.nextLine();
        
        if (kamar1.isTersedia()) {
            kamar1.dipesan(nama);
        } else if (kamar2.isTersedia()) {
            kamar2.dipesan(nama);
        } else if (kamar3.isTersedia()) {
            kamar3.dipesan(nama);
        } else {
            System.out.println("\nSemua kamar sudah terbook.");
        }
    }
    
    public void cekKetersediaan() {
        System.out.println("\n====================================");
        System.out.println("      Ketersediaan Kamar di " + namaHotel);
        System.out.println("====================================");
        kamar1.lihatKetersediaan();
        kamar2.lihatKetersediaan();
        kamar3.lihatKetersediaan();
        System.out.println("====================================");
    }
    
    public void lihatSemuaPesanan() {
        System.out.println("\n====================================");
        System.out.println("        Daftar Pesanan Kamar:");
        System.out.println("====================================");
        System.out.println("| No Kamar |   Tipe Kamar   |  Penyewa  |");
        kamar1.lihatPesanan();
        kamar2.lihatPesanan();
        kamar3.lihatPesanan();
        System.out.println("====================================");
    }
    
    public void batalkanPesanan() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nomor kamar yang ingin dibatalkan: ");
        int nomorKamar = input.nextInt();
        
        if (nomorKamar == 1) {
            kamar1.batalkanPesanan();
        } else if (nomorKamar == 2) {
            kamar2.batalkanPesanan();
        } else if (nomorKamar == 3) {
            kamar3.batalkanPesanan();
        } else {
            System.out.println("\nNomor kamar tidak valid.");
        }
    }
}