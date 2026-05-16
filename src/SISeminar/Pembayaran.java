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

protected double totalBayar;
protected String metodePembayaran;

// Constructor
public Pembayaran(double totalBayar, String metodePembayaran) {
this.totalBayar = totalBayar;
this.metodePembayaran = metodePembayaran;
}

// Method polymorphism
public String tampilPembayaran() {
return "Metode Pembayaran : " + metodePembayaran;
}

public String getMetodePembayaran() {
return metodePembayaran;
}
}

