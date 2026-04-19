package SISeminar;

public class PembayaranQRIS extends Pembayaran {

    // Atribut kodeQR dibuat PRIVATE agar tidak bisa diakses langsung dari luar class
    private String kodeQR;
    
    // Constructor untuk pembayaran QRIS
    public PembayaranQRIS(double total, String kodeQR) {

        // Memanggil constructor parent (Pembayaran) untuk set metode dan total
        super("QRIS", total);

        // Mengisi kode QR
        this.kodeQR = kodeQR;
    }
    
@Override
    public String tampilPembayaran() {
        return "Metode: QRIS" +
               "\nTotal: " + getTotalBayar() +
               "\nKode QR: " + kodeQR;
    }
    // Getter untuk mengambil kode QR
    public String getKodeQR() {
        return kodeQR;
    }

    // Setter untuk mengubah kode QR
    public void setKodeQR(String kodeQR) {
        this.kodeQR = kodeQR;
    }
}