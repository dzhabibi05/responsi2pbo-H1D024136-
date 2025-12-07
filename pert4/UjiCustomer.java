public class UjiCustomer {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Budi Santoso", "CST-001", 500000);

        Member member1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        customer1.tampilkanInfo();

        System.out.println("\nStatus: Member");
        member1.tampilkanInfo();
    }
}
