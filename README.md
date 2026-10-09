# Tugas Pewarisan dan Polimorfisme

Program simulasi rekening bank. Class Bank_2 sebagai induk, Tabungan dan Giro sebagai turunan, dan ArrayList untuk menyimpan daftar rekening serta riwayat transaksi.

## Cara menjalankan

```
javac *.java
java DemoBank
```

## Library tambahan

Tidak ada, hanya java.util.ArrayList.

## Penjelasan 

**Encapsulation**
Atribut `nama`, `balance`, dan `history` pada class Bank_2 dibuat
protected (bukan public) sehingga tidak bisa diubah sembarangan dari
luar. Data diakses melalui method seperti getBalance() dan getNama().

**Inheritance**
Class Tabungan dan Giro mewarisi Bank_2 dengan `extends`. Keduanya
otomatis memiliki atribut dan method milik Bank_2 (deposit, showInfo,
showHistory), lalu menambahkan fitur sendiri: bunga dan saldo minimum
pada Tabungan, overdraft dan biaya admin pada Giro.

**Polymorphism**
Method withdraw(), akhirBulan(), dan getJenis() di-override pada
subclass. Pada DemoBank, ArrayList<Bank_2> menyimpan objek Bank_2,
Tabungan, dan Giro sekaligus. Saat rek.withdraw() dipanggil dalam
loop, perilakunya berbeda sesuai jenis objeknya.

## Screenshot
<img width="1366" height="768" alt="Screenshot (563)" src="https://github.com/user-attachments/assets/8f360871-44e5-4686-af60-d64611414978" />
<img width="1366" height="768" alt="Screenshot (564)" src="https://github.com/user-attachments/assets/c8a35c3a-c1c9-4f86-9d50-9774f643ed6a" />

