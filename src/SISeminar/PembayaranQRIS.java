package SISeminar;

public class PembayaranQRIS extends Pembayaran {

private String kodeQR;

public PembayaranQRIS(double totalBayar, String kodeQR) {
super(totalBayar, "QRIS");
this.kodeQR = kodeQR;
}

@Override
public String tampilPembayaran() {
return "Pembayaran menggunakan QRIS";
}

public String getKodeQR() {
return kodeQR;
}
}

