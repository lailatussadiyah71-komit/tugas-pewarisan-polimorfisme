# Latihan PBO: Bentuk, Bujursangkar, Lingkaran, Silinder

Latihan penerapan **encapsulation**, **inheritance**, dan **polymorphism** pada Java.

## Struktur Kelas

```
Bentuk
├── BujurSangkar
└── Lingkaran
    └── Silinder
```

| Kelas | Turunan dari | Atribut | Method |
|---|---|---|---|
| `Bentuk` | - | `warna` | `getWarna()`, `setWarna()`, `printInfo()` |
| `BujurSangkar` | `Bentuk` | `sisi` | `getSisi()`, `setSisi()`, `hitungLuas()`, `printInfo()` |
| `Lingkaran` | `Bentuk` | `radius`, `PI` (konstanta) | `getRadius()`, `setRadius()`, `hitungLuas()`, `printInfo()` |
| `Silinder` | `Lingkaran` | `tinggi` | `getTinggi()`, `setTinggi()`, `hitungVolume()`, `printInfo()` |

## Penerapan Konsep PBO

### 1. Encapsulation
Atribut dibuat `private` sehingga tidak bisa diakses langsung dari luar kelas. Akses dan perubahan nilai dilakukan lewat getter dan setter.

- `Bentuk`: atribut `warna` diakses lewat `getWarna()` dan `setWarna()`
- `BujurSangkar`: atribut `sisi` lewat `getSisi()` dan `setSisi()`
- `Lingkaran`: atribut `radius` lewat `getRadius()` dan `setRadius()`
- `Silinder`: atribut `tinggi` lewat `getTinggi()` dan `setTinggi()`

### 2. Inheritance
Pewarisan dilakukan dengan kata kunci `extends`, dan constructor kelas induk dipanggil dengan `super(...)`.

- `BujurSangkar` dan `Lingkaran` mewarisi `Bentuk` (atribut `warna`, `getWarna()`, `setWarna()`)
- `Silinder` mewarisi `Lingkaran` sehingga bisa memakai `radius` dan `hitungLuas()` untuk menghitung volume (`luas alas x tinggi`)

### 3. Polymorphism
- **Method overriding**: `printInfo()` ditulis ulang (`@Override`) di setiap kelas turunan, sehingga masing-masing mencetak informasi yang berbeda.
- **Dynamic binding**: di `Main`, objek disimpan dalam array bertipe `Bentuk[]`. Saat `printInfo()` dipanggil dalam perulangan, Java menjalankan versi method sesuai tipe objek sebenarnya (`Bentuk`, `BujurSangkar`, `Lingkaran`, atau `Silinder`).

## Format Output `printInfo()`

- `Bentuk`: `Bentuk berwarna [warna]`
- `BujurSangkar`: `Bujursangkar berwarna [warna], luas = [luas]`
- `Lingkaran`: `Lingkaran [warna], luas = [luas]`
- `Silinder`: `Silinder warna [warna], volume = [volume]`

## Cara Menjalankan

Pastikan JDK sudah terpasang, lalu di folder yang berisi semua file `.java`:

```bash
javac *.java
java Main
```

## Screenshot Hasil
<img width="1366" height="768" alt="Screenshot (598)" src="https://github.com/user-attachments/assets/6a0518df-5b3a-46c2-baaf-856431afd86a" />
