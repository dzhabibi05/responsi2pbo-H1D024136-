class Customer {
    String nama;
    String IdCustomer;
    int totalBelanja;

    public Customer(String nama, String IdCustomer, int totalBelanja) {
        this.nama = nama;
        this.IdCustomer = IdCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + this.nama + " | ID: " + this.IdCustomer + " | Total Belanja: Rp " + this.totalBelanja);
    }
}
