import java.util.ArrayList;
 
public class DemoBank {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank ABC");
        System.out.println();
 
        ArrayList<Bank_2> daftarRekening = new ArrayList<Bank_2>();
        daftarRekening.add(new Bank_2("Andi", 100000));                    
        daftarRekening.add(new Tabungan("Budi", 500000, 0.01, 50000));      
        daftarRekening.add(new Giro("Citra", 200000, 300000, 10000));       
 
        System.out.println("--- Daftar Rekening ---");
        for (Bank_2 rek : daftarRekening) {
            rek.showInfo();
        }
        System.out.println();
 
        System.out.println("--- Withdraw Rp 400000 untuk semua rekening ---");
        for (Bank_2 rek : daftarRekening) {
            System.out.println(">> " + rek.getNama() + " (" + rek.getJenis() + ")");
            rek.withdraw(400000);
            System.out.println();
        }
 
        System.out.println("--- Deposit Rp 200000 untuk semua rekening ---");
        for (Bank_2 rek : daftarRekening) {
            System.out.println(">> " + rek.getNama());
            rek.deposit(200000);
            System.out.println();
        }
        System.out.println("--- Proses Akhir Bulan ---");
        for (Bank_2 rek : daftarRekening) {
            System.out.println(">> " + rek.getNama() + " (" + rek.getJenis() + ")");
            rek.akhirBulan();
            System.out.println();
        }
        for (Bank_2 rek : daftarRekening) {
            rek.showHistory();
            System.out.println();
        }
    }
}
