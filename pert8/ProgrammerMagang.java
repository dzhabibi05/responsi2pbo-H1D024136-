// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }
    
    @Override
    public double hitungGaji(int jamKerja) {
        return jamKerja * gajiPerJam;
    }
    
    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }
    
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }
    
    @Override
    public void login (String pin){
        if(this.pinRahasia.equals(pin)){
            this.sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + this.nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        this.sedangLogin = false;
        System.out.println(this.nama + " berhasil logout");
    }
    
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
    
}