/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SISeminar;

/**
 *
 * @author Hype G12
 */
public class Pembayaran {

    String metodePembayaran;
    double totalBayar;

    // Constructor
    public Pembayaran(String metode, double total) {
        metodePembayaran = metode;
        totalBayar = total;
    }

    void tampilPembayaran() {
        System.out.println("Metode Bayar : " + metodePembayaran);
        System.out.println("Total Bayar  : " + totalBayar);
    }
}
