package SISeminar;


public class CetakTiket {

    private Pemesanan_Tiket tiket;
    private Pembayaran pembayaran;

    public CetakTiket(Pemesanan_Tiket tiket, Pembayaran pembayaran) {
        this.tiket = tiket;
        this.pembayaran = pembayaran;}

    public String tampilTiket() {
        return "===== TIKET SEMINAR =====\n"
        + "ID Tiket : " + tiket.getIdTiket() + "\n"
        + "Nama : " + tiket.getNama() + "\n"
        + "Email : " + tiket.getEmail() + "\n"
        + "Seminar : " + tiket.getSeminar() + "\n"
        + "Jumlah : " + tiket.getJumlah() + "\n"
        + "Harga : " + tiket.getHarga() + "\n"
        + "Total Bayar: " + tiket.hitungTotal() + "\n"
        + pembayaran.tampilPembayaran() + "\n"
        + "========================";
        }
    }
