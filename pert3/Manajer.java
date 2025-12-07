// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    double gajiTujangan;
    
    public Manajer (String nama, double gajiPokok, double gajiTujangan) {
        super(nama, gajiPokok);
        this.gajiTujangan = gajiTujangan;
    }
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + gajiTujangan);
        double totalPendapatan = gajiPokok + gajiTujangan;
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}