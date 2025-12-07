class mesinMotor extends defaultMesin {
    String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Motor " + this.namaMesin + " | Tipe: " + this.tipeMotor + " | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
