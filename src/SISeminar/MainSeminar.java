package SISeminar;

import java.util.Scanner;
import java.util.Random;

public class MainSeminar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String idTiket = "SMR" + (1000 + random.nextInt(9000));

        System.out.println("=== PEMESANAN TIKET SEMINAR ONLINE ===");

        System.out.print("Nama Peserta : ");
        String nama = input.nextLine();

        System.out.print("Email Peserta : ");
        String email = input.nextLine();

        System.out.println("\nDAFTAR SEMINAR");
        System.out.println("1. Artificial Intelligence");
        System.out.println("2. Cyber Security");
        System.out.println("3. Web Development");
        System.out.print("Pilih (1-3) : ");
        int pilih = input.nextInt();

        String seminar = "";
        double harga = 0;

        switch (pilih) {
            case 1:
                seminar = "Artificial Intelligence";
                harga = 150000;
                break;
            case 2:
                seminar = "Cyber Security";
                harga = 200000;
                break;
            case 3:
                seminar = "Web Development";
                harga = 180000;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Jumlah Tiket : ");
        int jumlah = input.nextInt();

        // Buat objek tiket
        Pemesanan_Tiket pesan = new Pemesanan_Tiket(idTiket, nama, email, seminar, jumlah, harga);

        // Pilih pembayaran
        System.out.println("\nMetode Pembayaran:");
        System.out.println("1. QRIS");
        System.out.println("2. Transfer");
        System.out.print("Pilih : ");
        int metode = input.nextInt();

        Pembayaran bayar;

        if (metode == 1) {
            bayar = new PembayaranQRIS(pesan.hitungTotal(), "QR123XYZ");
        } else {
            bayar = new PembayaranTransfer(pesan.hitungTotal(), "BCA");
        }

        // Cetak tiket
        CetakTiket cetak = new CetakTiket(pesan, bayar);

        System.out.println();
        System.out.println(cetak.tampilTiket());
    }
}