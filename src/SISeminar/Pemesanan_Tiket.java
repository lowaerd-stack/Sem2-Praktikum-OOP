

package SISeminar;


public class Pemesanan_Tiket {

    private String idTiket;
    private String nama;
    private String email;
    private String seminar;
    private int jumlah;
    private double harga;

    // Constructor
    public Pemesanan_Tiket(String idTiket, String nama, String email, String seminar, int jumlah, double harga) {
        this.idTiket = idTiket;
        this.nama = nama;
        this.email = email;
        this.seminar = seminar;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Overloading Method
    public double hitungTotal() {
        return jumlah * harga;
    }

    public double hitungTotal(double diskon) {
        return (jumlah * harga) - diskon;
    }

    public double hitungTotal(double pajak, boolean isPajak) {
        if (isPajak) {
            return (jumlah * harga) + pajak;
        }
        return jumlah * harga;
    }

    // Getter & Setter
    public String getIdTiket() { return idTiket; }
    public void setIdTiket(String idTiket) { this.idTiket = idTiket; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSeminar() { return seminar; }
    public void setSeminar(String seminar) { this.seminar = seminar; }

    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}