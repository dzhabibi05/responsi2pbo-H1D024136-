class Pengguna {
    public int umur;
    public double beratBadan; // dalam kg
    public double tinggiBadan; // dalam cm
    public static final double faktorAktivitas = 1.2;

    // Default Constructor
    public Pengguna() {
        this.umur=umur;
        this.beratBadan=beratBadan;
        this.tinggiBadan=tinggiBadan;
    }

    // Constructor dengan parameter
    public Pengguna(int umur, double beratBadan, double tinggiBadan) {
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {
        return beratBadan / (tinggiBadan/100 * tinggiBadan/100);

    }

    void tampilKategori() {
        if (hitungBMI()<18.5){
            System.out.println("Kategori: Kurus");
        } else if (hitungBMI()<25) {
            System.out.println("Kategori: Normal");
        }else {
            System.out.println("Kategori: Obesitas");
        }

    }
    double hitungKalori() {
        return beratBadan * faktorAktivitas * 10;
    }
    void tampilInfo() {
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + beratBadan + " kg");
        System.out.println("Tinggi: " + tinggiBadan + " cm");
        System.out.printf("BMI: %.2f%n", hitungBMI());
        tampilKategori();
        System.out.println ("Kebutuhan Kalori: "+hitungKalori()+" kal/hari");
    }
}