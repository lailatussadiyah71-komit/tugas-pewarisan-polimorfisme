import java.util.ArrayList;
public class Bank_2 {
    protected String nama;
    protected int balance;
    protected ArrayList<String> history;

    public Bank_2(String nama, int balance) {
        this.nama = nama;
        this.balance = balance;
        history = new ArrayList<String>();
        history.add("Saldo awal : Rp " + balance);
    }
    public void deposit (int amount) {
        balance = balance + amount;
        history.add ("Deposit : Rp " + amount + "| Saldo : Rp " + balance);
        System.out.println ("Deposit : Rp " + amount);
        System.out.println ("Current balance : Rp " + balance);
    }
    public void withdraw (int amount) {
        if (amount > balance) {
            System.out.println ("Withdraw gagal, saldo tidak cukup");
            history.add ("Withdraw GAGAL ' Rp " + amount);
        } else {
            balance = balance - amount;
            history.add ("Withdraw : Rp " + amount + " | Saldo : Rp " + balance);
            System.out.println( "Withdraw: Rp " + amount);
            System.out.println( " Current balance : Rp " + balance);
        }
    }
    public void akhirBulan () {
        System.out.println ("  tidak ada proses akhir bulan untuk rekening umum ");
    }
    public String getJenis() {
        return "Rekening umum";
    }
    public int getBalance () {
        return balance;
    }
    public String getNama () {
        return nama;
    }
    public void showInfo () {
        System.out.println("[" +  getJenis() + "] " + nama + "| Saldo : Rp " + balance );
    }
    public void showHistory() {
        System.out.println("=== Riwayat Transaksi " + nama + " (" + getJenis() + ") ===");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }
}