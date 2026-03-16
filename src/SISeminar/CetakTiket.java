/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISeminar;

/**
 *
 * @author Hype G12
 */
public class CetakTiket {

    Pemesanan_Tiket tiket;
    Pembayaran bayar;

    // Constructor
    public CetakTiket(Pemesanan_Tiket t, Pembayaran b) {
        tiket = t;
        bayar = b;
    }

    void cetak() {

        System.out.println();
        System.out.println("===== TIKET SEMINAR =====");
        System.out.println("ID Tiket        : " + tiket.idTiket);
        System.out.println("Nama Peserta    : " + tiket.namaPeserta);
        System.out.println("Email           : " + tiket.email);
        System.out.println("Seminar         : " + tiket.seminar);
        System.out.println("Jumlah Tiket    : " + tiket.jumlahTiket);
        System.out.println("Harga Tiket     : " + tiket.harga);
        System.out.println("Total Bayar     : " + tiket.hitungTotal());
        System.out.println("Metode Bayar    : " + bayar.metodePembayaran);
        System.out.println("==========================");
    }
}