class Member extends Customer {
    int poinReward;
    String levelMember;

    public Member(String nama, String IdCustomer, int totalBelanja, int poinReward, String levelMember) {
        super(nama, IdCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelMember = levelMember;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + this.poinReward + " | Level: " + this.levelMember);
    }
}
