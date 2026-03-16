/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISeminar;

/**
 *
 * @author Hype G12
 */
public class Pemesanan_Tiket {

    String idTiket;
    String namaPeserta;
    String email;
    String seminar;
    int jumlahTiket;
    double harga;
    String metodePembayaran = "QRIS";

    void inputData(String id, String nama, String mail, String sem, int jumlah, double hrg) {
        idTiket = id;
        namaPeserta = nama;
        email = mail;
        seminar = sem;
        jumlahTiket = jumlah;
        harga = hrg;
    }

    double hitungTotal() {
        return jumlahTiket * harga;
    }

    void cetakTiket() {
        System.out.println();
        System.out.println("===== TIKET SEMINAR =====");
        System.out.println("ID Tiket        : " + idTiket);
        System.out.println("Nama Peserta    : " + namaPeserta);
        System.out.println("Email           : " + email);
        System.out.println("Seminar         : " + seminar);
        System.out.println("Jumlah Tiket    : " + jumlahTiket);
        System.out.println("Harga Tiket     : " + harga);
        System.out.println("Total Bayar     : " + hitungTotal());
        System.out.println("Metode Bayar    : " + metodePembayaran);
        System.out.println("==========================");
    }
}