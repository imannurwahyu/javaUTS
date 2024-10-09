package UTSpraktikum;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tampilkanSelamatDatang();
        Hotel hotel = new Hotel("The Jayakarta");
        
        System.out.print("Login sebagai (admin/customer): ");
        String role = input.nextLine();
        
        while (true) {
            tampilkanMenu(role);
            
            int pilihan = input.nextInt();
            input.nextLine();
            
            if (pilihan == 1) {
                hotel.pesanKamar();
            } else if (pilihan == 2) {
                hotel.cekKetersediaan();
            } else if (role.equalsIgnoreCase("admin") && pilihan == 3) {
                hotel.lihatSemuaPesanan();
            } else if (role.equalsIgnoreCase("admin") && pilihan == 4) {
                hotel.batalkanPesanan();
            } else if (pilihan == 5) {
                tampilkanKeluar();
                break;
            } else {
                System.out.println("\nPilihan tidak valid");
            }
        }
    }
    
    public static void tampilkanKeluar() {
        System.out.println("\n====================================");
        System.out.println("|         Terima Kasih!            |");
        System.out.println("|          Sampai Jumpa            |");
        System.out.println("====================================");
    }
    public static void tampilkanSelamatDatang() {
        System.out.println("====================================");
        System.out.println("|          Selamat Datang          |");
        System.out.println("|       The Jayakarta Hotel        |");
        System.out.println("====================================");
    }
    
    public static void tampilkanMenu(String role) {
        System.out.println("\n====================================");
        System.out.println("  Selamat Datang di The Jayakarta");
        System.out.println("====================================");
        System.out.println("|        Pilihan Menu:              |");
        System.out.println("====================================");
        System.out.println("| 1. Pesan Kamar                    |");
        System.out.println("| 2. Cek Ketersediaan Kamar         |");
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("| 3. Lihat Semua Pesanan            |");
            System.out.println("| 4. Batalkan Pesanan               |");
        }
        System.out.println("| 5. Keluar                         |");
        System.out.println("====================================");
        System.out.print("Pilih menu: ");
    }
}



