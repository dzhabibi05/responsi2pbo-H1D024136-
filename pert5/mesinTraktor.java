class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor " + this.namaMesin + " | Tarik: " + this.kapasitasTarik + " ton | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup Mesinnn!");
    }
}
