class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + this.namaMesin + " | Tarik: " + this.kapasitasTarik + " ton | Baterai: " + this.kapasitasBaterai + " kWh | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
