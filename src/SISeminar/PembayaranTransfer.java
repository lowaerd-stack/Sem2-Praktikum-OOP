package SISeminar;

public class PembayaranTransfer extends Pembayaran {

    // Atribut bank dibuat PRIVATE agar lebih aman
    private String bank;

    // Constructor untuk pembayaran transfer bank
    public PembayaranTransfer(double total, String bank) {

        // Memanggil constructor parent (Pembayaran) untuk set metode dan total
        super("Transfer", total);

        // Mengisi nama bank
        this.bank = bank;
    }

    @Override
public String tampilPembayaran() {
    return "Metode: Transfer" +
           "\nTotal: " + getTotalBayar() +
           "\nBank: " + bank;
}
    // Getter untuk mengambil nama bank
    public String getBank() {
        return bank;
    }

    // Setter untuk mengubah nama bank
    public void setBank(String bank) {
        this.bank = bank;
    }
}