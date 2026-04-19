package SISeminar;

public class CetakTiket {

    // Atribut dibuat PRIVATE agar data tidak dapat diubah langsung dari luar class
    private Pemesanan_Tiket tiket;
    private Pembayaran pembayaran;

    // Constructor untuk menghubungkan objek tiket dan pembayaran
    public CetakTiket(Pemesanan_Tiket tiket, Pembayaran pembayaran) {
        this.tiket = tiket;
        this.pembayaran = pembayaran;
    }

    // Method untuk menampilkan tiket dalam bentuk teks
    public String tampilTiket() {

        // Data diambil menggunakan getter (karena atribut di class lain bersifat private)
        return "===== TIKET SEMINAR =====\n"
                + "ID Tiket   : " + tiket.getIdTiket() + "\n"
                + "Nama       : " + tiket.getNama() + "\n"
                + "Email      : " + tiket.getEmail() + "\n"
                + "Seminar    : " + tiket.getSeminar() + "\n"
                + "Jumlah     : " + tiket.getJumlah() + "\n"
                + "Harga      : " + tiket.getHarga() + "\n"
                + "Total Bayar: " + tiket.hitungTotal() + "\n"
                + "Metode     : " + pembayaran.getMetodePembayaran() + "\n"
                + "========================";
    }
}