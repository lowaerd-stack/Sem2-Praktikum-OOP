package SISeminar;

public class PembayaranTransfer extends Pembayaran {

private String bank;

public PembayaranTransfer(double totalBayar, String bank) {
super(totalBayar, "Transfer");
this.bank = bank;
}

@Override
public String tampilPembayaran() {
return "Pembayaran menggunakan Transfer Bank";
}

public String getBank() {
return bank;
}
}

