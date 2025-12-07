public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak cukup untuk menembakkan " + jumlah + " rudal.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsiEnergi = jarak * 3;
        if (getLevelEnergi() >= konsumsiEnergi) {
            setLevelEnergi(getLevelEnergi() - konsumsiEnergi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        System.out.println("Mengisi energi pesawat tempur sebanyak " + jumlah + "%.");
    }
    
    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    //   "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
}
