# Aplikasi Pengurutan Harga Barang

Proyek ini adalah aplikasi Java untuk mengurutkan daftar nama dan harga barang. Aplikasi ini menggunakan dua metode sorting:
- **Insertion Sort** untuk mengurutkan harga secara **ascending** atau dari kecil ke besar.
- **Bubble Sort** untuk mengurutkan harga secara **descending** atau dari besar ke kecil.

Daftar nama barang dan harganya ditampilkan dalam bentuk tabel yang memudahkan pengguna untuk melihat hasil pengurutan berdasarkan harga.

## Fitur Utama

- Menampilkan daftar barang dan harga dalam tabel.
- Mengurutkan harga barang secara **ascending** menggunakan **Insertion Sort**.
- Mengurutkan harga barang secara **descending** menggunakan **Bubble Sort**.

## Struktur Proyek
SORT/
├── .idea/               
├── out/                 
├── src/                 # Folder kode sumber Java (termasuk algoritma sorting)
│   ├── sort/            # Package sort
│   │   ├── BubbleSort.java  # Implementasi Bubble Sort (Descending)
│   │   └── InsertionSort.java  # Implementasi Insertion Sort (Ascending)
│   └── Main.java        # File utama untuk menjalankan aplikasi
├── .gitignore           
├── README.md            # Dokumentasi proyek
└── SORT.iml  

## Deskripsi Kode

### 1. **Insertion Sort (Ascending)**
- Mengurutkan daftar nama dan harga barang secara naik (ascending) menggunakan algoritma Insertion Sort.
- Setiap elemen dibandingkan dengan elemen sebelumnya, dan dipindahkan jika elemen tersebut lebih kecil dari elemen sebelumnya.

### 2. **Bubble Sort (Descending)**
- Mengurutkan daftar nama dan harga barang secara turun (descending) menggunakan algoritma Bubble Sort.
- Dua elemen yang berdekatan dibandingkan, dan jika dalam urutan yang salah, mereka ditukar. Proses ini diulang hingga daftar terurut.

## Contoh Output

Aplikasi Pengurut Harga Barang
dengan Insertion Sort dan Bubble Sort
Lidwina Eleonora Dora - 235150707111019

Masukkan jumlah barang:
7

Barang ke-1
Nama Barang		: tisu
Harga Barang	: 8000

Barang ke-2
Nama Barang		: air
Harga Barang	: 5000

Barang ke-3
Nama Barang		: sabun
Harga Barang	: 17000

Barang ke-4
Nama Barang		: mie
Harga Barang	: 3000

Barang ke-5
Nama Barang		: deterjen
Harga Barang	: 6000

Barang ke-6
Nama Barang		: tisu basah
Harga Barang	: 20000

Barang ke-7
Nama Barang		: pasta gigi
Harga Barang	: 2000

===============================
Pengurutan Harga Barang
oleh	: Lidwina Eleonora Dora
NIM		: 235150707111019
===============================

Ascending dari kecil ke besar dengan Insertion Sort
---------------------------------------------------
Nama Barang               | Harga Barang       
pasta gigi                | Rp2.000,00         
mie                       | Rp3.000,00         
air                       | Rp5.000,00         
deterjen                  | Rp6.000,00         
tisu                      | Rp8.000,00         
sabun                     | Rp17.000,00        
tisu basah                | Rp20.000,00        
---------------------------------------------------

Descending dari besar ke kecil dengan Bubble Sort
-------------------------------------------------
Nama Barang               | Harga Barang       
tisu basah                | Rp20.000,00        
sabun                     | Rp17.000,00        
tisu                      | Rp8.000,00         
deterjen                  | Rp6.000,00         
air                       | Rp5.000,00         
mie                       | Rp3.000,00         
pasta gigi                | Rp2.000,00         
-------------------------------------------------
