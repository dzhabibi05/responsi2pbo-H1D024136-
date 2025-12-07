public abstract class KendaraanGalaksi {
    private String nama;
    private int levelEnergi;
    private int kapasitasPenumpang;

    KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.nama = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    public String getNamaKendaraan() {
        return nama;
    }
    public int getLevelEnergi() {
        return levelEnergi;
    }
    public void setLevelEnergi(int levelEnergi) {
        this.levelEnergi = levelEnergi;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public final void tampilStatus() {
        System.out.println(nama + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);

}
