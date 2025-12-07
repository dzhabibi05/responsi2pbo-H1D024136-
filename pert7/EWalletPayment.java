public class EWalletPayment implements PaymentMethod {
    String namaLayanan;
    double saldo;
    double nominalTransaksi;
    final double biayaTransaksi = 2000;

    EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    @Override
    public void processPayment(){
        double totalBayar = nominalTransaksi + biayaTransaksi;
        if (saldo >= totalBayar) {
            saldo -= totalBayar;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "E-Wallet: " + namaLayanan + ", Nominal: Rp " + nominalTransaksi;
    }

    @Override
    public double getTransactionFee() {
        return biayaTransaksi;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
