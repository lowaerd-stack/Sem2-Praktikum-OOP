/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISeminar;

/**
 *
 * @author Hype G12
 */
import java.util.Scanner;
import java.util.Random;
public class MainSeminar {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Pemesanan_Tiket pesan = new Pemesanan_Tiket();

        String idTiket = "SMR" + (1000 + random.nextInt(9000));

        System.out.println("=== PEMESANAN TIKET SEMINAR ONLINE ===");

        System.out.print("Nama Peserta : ");
        String nama = input.nextLine();

        System.out.print("Email Peserta : ");
        String email = input.nextLine();

        System.out.println();
        System.out.println("DAFTAR SEMINAR");
        System.out.println("1. Seminar Artificial Intelligence");
        System.out.println("2. Seminar Cyber Security");
        System.out.println("3. Seminar Web Development");
        System.out.print("Pilih Seminar (1-3) : ");
        int pilih = input.nextInt();

        String seminar = "";
        double harga = 0;

        if (pilih == 1) {
            seminar = "Seminar Artificial Intelligence";
            harga = 150000;
        } 
        else if (pilih == 2) {
            seminar = "Seminar Cyber Security";
            harga = 200000;
        } 
        else if (pilih == 3) {
            seminar = "Seminar Web Development";
            harga = 180000;
        } 
        else {
            System.out.println("Pilihan seminar tidak tersedia.");
            return;
        }

        System.out.print("Jumlah Tiket : ");
        int jumlah = input.nextInt();

        pesan.inputData(idTiket, nama, email, seminar, jumlah, harga);

        pesan.cetakTiket();
    }
}

