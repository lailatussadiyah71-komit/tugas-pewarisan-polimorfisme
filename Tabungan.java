public class Tabungan extends Bank_2 {
    private double bunga;
    private int saldoMinimum;

    public Tabungan (String nama, int balance, double bunga, int  saldoMin) {
        super (nama, balance);
        this.bunga = bunga;
        this.saldoMinimum = saldoMin;
    }

    @Override
    public void withdraw (int amount) {
        if (balance  - amount < saldoMinimum) {
            System.out.println("Withdraw gagal, saldo minimum Rp " + saldoMinimum + " harus tersisa!");
            history.add ("Withdraw GAGAL (saldo minimum): Rp " + amount);
        } else {
            super.withdraw(amount);
        }
    }
    @Override
    public void akhirBulan () {
        int nilaiBunga = (int) (balance * bunga);
        balance += nilaiBunga;
        history.add("Bunga: Rp " + nilaiBunga + " | Saldo: Rp " + balance);
        System.out.println("Bunga " + (bunga * 100) + "% masuk: Rp " + nilaiBunga);
        System.out.println("Current balance: Rp " + balance);
    }
     @Override
     public String getJenis () {
        return "Tabungan";
     }
}