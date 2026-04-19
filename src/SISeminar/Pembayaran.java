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

    // Atribut
    private String metodePembayaran;
    private double totalBayar;

    // Constructor
    public Pembayaran(String metodePembayaran, double totalBayar) {
        this.metodePembayaran = metodePembayaran;
        this.totalBayar = totalBayar;
    }

    // Method (akan dioverride)
    public String tampilPembayaran() {
        return "Metode: " + metodePembayaran +
               "\nTotal: " + totalBayar;
    }

    // Getter & Setter
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}