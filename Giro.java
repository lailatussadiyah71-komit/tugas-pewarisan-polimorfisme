public class Giro extends Bank_2 {
    private int batasOverdraft;
    private int biayaAdmin;

    public Giro (String nama, int balance, int batasOverdraft, int biayaAdmin)  {
        super (nama, balance);
        this.batasOverdraft = batasOverdraft;
        this.biayaAdmin = biayaAdmin;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance + batasOverdraft) {
            System.out.println("Withdraw gagal, melebihi batas overdraft Rp " + batasOverdraft + "!");
            history.add("Withdraw GAGAL (overdraft): Rp " + amount);
        } else {
            balance = balance - amount;
            history.add("Withdraw: Rp " + amount + " | Saldo: Rp " + balance);
            System.out.println("Withdraw: Rp " + amount);
            System.out.println("Current balance: Rp " + balance);
            if (balance < 0) {
                System.out.println("Perhatian: saldo minus (overdraft)!");
            }
        }
    }
    @Override
    public void akhirBulan() {
        balance -= biayaAdmin;
        history.add("Biaya admin: Rp " + biayaAdmin + " | Saldo: Rp " + balance);
        System.out.println("Biaya admin: Rp " + biayaAdmin);
        System.out.println("Current balance: Rp " + balance);
    }
    @Override
    public String getJenis() {
        return "Giro";
    }
}