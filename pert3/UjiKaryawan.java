class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        Karyawan karyawanBiasa = new Karyawan("Budi Santoso", 4000000);

        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        karyawanBiasa.tampilInfo();
        System.out.println();

        Manajer manajer = new Manajer("Siti Aminah", 6000000, 2500000);

        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
        
    }
}