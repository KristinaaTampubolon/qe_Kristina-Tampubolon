# Software Testing Fundamental

## Software Testing

#### Manfaat software Testing :

- Menghemat uang
- Menjamin kualitas product
- Menjaga keamanan
- Menjaga kepuasan pelanggan

## Testing Platform

1. _API(Application Programming Interface)_ : Sekumpulan defenisi dan protokol untuk membangun dan mengintegrasikan app software
2. _Web_ : Kumpulan halaman yang berisi info tertentu secara publik
3. _Mobile_ : Android / Ios
4. _Desktop_

## Tipe Testing

**Functional Testing** : Jenis pengujian yang memverifikasi setiap fungsi dalam aplikasi telah beroperasi sesuai requirement

- Manual
- Automate

**Non-Functional Testing** : Pengujian aspek nofungsional aplikasi seperti kinerja, keandalan , kegunaan dll
Dilakukn setelah functional testing
cth : _Performance Testing_ : Memastikan suatu aplikasi bekerja dengan baik dibawah beban yang diharapkan
Beberapa konsen dalam performance Testing : - Speed : Kecepatan respon aplikasi - Scalability : Maksimum user load - Stability : kestabilan app dalam load

**Maintanance Testing** : Dilakukan setelah dirilis ke konsumen
Diperlukan untuk mempertahankan kualitas karakteristik non functional
contoh :

1. Regression Testing : DIlakukan setiap kali ada functional baru atau functional lama dihapus untuk memastikan tidak ada bug baru

## LEVEL TESTING

#### Unit Testing

**Unit Testing** Menguji setiap unit/komponen perangkat lunak --> Saat masa development
Automation : JUnit

#### Integration Testing

**Integration Testing**: Pengujian dari hasil Penggabungan unit dan ditesting dalam satu group
Tujuan :

- Memeriksa aplikasi dapat berfungsi dengan baik
- memeriksa kinerja aplikasi
- Memeriksa struktur program yang sudah di rancang

#### System Testing

**System Testing** : End to end testing

#### Acceptance Testing

**Acceptance Testing** :Menentukan sistem sudah memenuhi kebutuhan pengguna dan merupakan tahap terakhir
