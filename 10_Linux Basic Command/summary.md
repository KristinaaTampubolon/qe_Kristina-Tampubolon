# LINUX BASIC COMMANDS.

- Kelebihan Command

1. Less Resources
2. Repetitive Task Friendly
3. Powerfull

## Linux Commands Structure

command [options] [parameter]
ls -a /usr : File yang akan menampilkan namanya dimulai dari titik atau tersembunyi.

## Basic Command

- Cal : untuk menampilkan kalender
- Date : menampilkan tanggal

## File System Commands

- Touch : untuk membuat file yang kosong melalui baris perintah linux.
- touch /home/username/document/web.html : membuat file web.html di dalam direktori dokumen.
- cat : membuat daftar konten atau isi file pada standard output contoh : cat file.txt
- cp : untuk menyalin file dari direktori aktif ke direktori lain.
- mv : memindahkan file ke direktori lain dapat juga digunakan untuk mengganti nama file
  mv file.txt/home/username
- rm : menghapus direktori beserta isinya dimana kita harus berhati hati untuk mencek direktori mana yang akan kita hapus dikarenakan file yang sudah dihapus tidak akan dapat dikembalikan lagi.
- mkdir: membuat direktori baru
- rmdir :menghapus direktori yang kosong
- cd :menjelajahi file di Linux
- pwd d: memberikan informasi mengenai direktori aktif yang sedang Anda akses

## Process CONTROL Commands

1. top :menampilkan kinerja sistem secara real time seperti CPU, Memory, Serta proses yang sedang berjalan. Pengawasan terhadap resource sistem sangat disarankan
2. clear : membersihkan layar terminal. Dimana dengan mengeetikkan perintah terebut akan membersihkan perintah sebelummnya yang ada pada layar terminal linux.
3. history : mengecek kembali komen yang sudah ditambahkan sebelumnya.

### Utilities Program Commands

1. ls : menampilkan semua file yang ada di direktori kita
2. which : mencari file yang dapat dieksekusi terkait dengan comment yang diberikan.
3. sudo : menjalankan task yang memerlukan hak akses atau permission adminstratif (root) penggunaan sudo tidak terlalu disarankan karena kapan saja bisa terjadi error apabila kita melakukan kesalahan.
4. find : mencari file dan direktori, lebih ditujukan untuk mencari file yang berlokasi di direktori yang dituju.

### FILE ACCESS Permissions

1. chmod : membaca permission dari file dan direktori.
2. chown : mengubah pemilik file sistem file, direktori.

## Shell Script

_Shell script_ adalah sebuah bahasa pemrograman yang dieksekusi berdasakan shell commands dan juga shell merupakan program yang berfungsi sebagai jembatan antara user dan kernel.
Keuntungan menggunakan shell pada dunia testing yaitu ketika harus mengeksekusi beberapa commands beruturut-turut, hal itu membuat kita harus menunggu command pertama baru bisa melakukan command berikutnya.
