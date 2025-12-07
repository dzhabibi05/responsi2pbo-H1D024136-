public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }
    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsiEnergi = jarak * 2;
        if (getLevelEnergi() >= konsumsiEnergi) {
            // Kurangi energi
            int sisaEnergi = getLevelEnergi() - konsumsiEnergi;
            setLevelEnergi(sisaEnergi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        int energiSaatIni = getLevelEnergi();
        int energiBaru = energiSaatIni;

        for (int i = 0; i < jumlah; i++) {
            if (energiBaru < 100) {
                energiBaru++;
            } else {
                break;
            }
        }

        setLevelEnergi(energiBaru);
        System.out.println("Mengisi energi sebanyak " + jumlah + "%. Level energi sekarang: " + energiBaru + "%");
    }

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
