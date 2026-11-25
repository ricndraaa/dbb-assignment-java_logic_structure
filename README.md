# Java Logic & Structure — Assignment

Assignment **Quality Assurance Bootcamp** untuk materi *Java Logic and Structure*.
Project ini berisi latihan dasar logika Java: conditional (`if` / `else`), `switch case`, dan looping (`for` & `while`), masing-masing dibuat dalam bentuk program kecil yang interaktif lewat console.

## Struktur Project

```
dbb-assignment-java_logic_structure/
└── abb-assignment-d20/
    ├── build.gradle.kts
    ├── settings.gradle.kts
    └── src/
        ├── main/
        │   ├── java/
        │   │   ├── ifelse/IfElseExercise.java
        │   │   ├── switchcase/SwitchCaseExercise.java
        │   │   └── forwhile/LoopingExercise.java
        │   └── resources/
        └── test/
            └── java/
```

## Isi Latihan

### 1. `IfElseExercise` — Simulasi ATM Sederhana
Program meminta PIN, lalu nominal tarik tunai. Validasi yang dilakukan:
- PIN harus benar
- Nominal harus kelipatan Rp50.000
- Nominal tidak boleh melebihi batas sekali tarik (Rp2.000.000)
- Saldo harus mencukupi

Konsep yang digunakan: `if`, `if-else`, `else if`, dan **nested if**.

### 2. `SwitchCaseExercise` — Mesin Self Service Restoran
Pembeli memilih menu (1. Kebab, 2. Berjer, 3. Pitsa), lalu memilih apakah pesanan dijadikan paket (tambah es teh dan kentang goreng). Program menampilkan total harga.

Konsep yang digunakan: `switch` dengan 3 `case`, `break`, `default` untuk menu yang tidak tersedia, dan nested `switch` dengan tipe `String`.

### 3. `LoopingExercise` — Pemesanan Berulang
Daftar menu dan harga disimpan dalam array, lalu pembeli bisa memesan berkali-kali sampai selesai.

Konsep yang digunakan:
- `for` untuk menampilkan daftar menu dari array
- `while` untuk mengulang proses pemesanan selama pembeli masih ingin pesan

## Cara Menjalankan
1. Clone repository ini, lalu buka foldernya di IntelliJ IDEA.
2. Tunggu proses Gradle sync selesai.
3. Buka salah satu class, lalu klik tombol **Run (▶)** di samping method `main`.
4. Masukkan input lewat console.

## Tools
- Java
- IntelliJ IDEA
- Gradle (Kotlin DSL)
