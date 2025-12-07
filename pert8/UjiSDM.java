public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");
        ProgrammerMagang pm = new ProgrammerMagang("Andi", 50000.0, "1234");
        System.out.println("Gaji Andi (160 jam) adalah: Rp " + pm.hitungGaji(160));
        System.out.println("Status Cuti: " + pm.getStatusCuti());
        pm.login("9999"); // Tes PIN salah
        pm.login("1234"); // Tes PIN benar
        System.out.println("Role Akses: " + pm.getRoleAkses());
        pm.perpanjangKontrak(6);
        pm.logout();
        
    }
}