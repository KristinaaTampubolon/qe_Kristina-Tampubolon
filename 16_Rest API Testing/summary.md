# Pengenalan RESTful API

1. API dan Cara Kerja
   API adalah (Application Programming Interface) : penghubung yang memungkin aplikasi dapat berinteraksi dengan aplikasi lainnya dan berbagai data.

### Tujuan API

1. Mempercepat proses Development dengan menyediakan function secara terpisah agar tidak perlu membuat fitur yang serupa.

### REST API

- Rest API adalah salah satu dari desain arsitektur yang terdapat di dalam API itu sendiri. Dan cara kerja dari RESTful API yaitu REST client akan Melakukan akses pada data/resource pada REST server dimana masing-masing resource. Atau data/resource tersebut akan dibedakan oleh sebuah global ID atau URIs (Universal Resource Identifiers) dan menggunakan HTTP Method sebagai protokol untuk komunuikasi data dan implementasi dari web service dan berisi aturan atau batasan untuk programmmer untuk mengawasi tindakan tertentu dalam database.
- Data yang digunakan umumnya dalam bentuk JSON

#### HTTP Method

Ada 4 method yang digunakan dalam HTTP Method

1. GET
   GET digunakan untuk membaca data (READ ONLY) tidak ada pembaruan data seperti update, delete dan read.
2. POST
   Mengirimkan data baru ke server, POST berisi beberapa data untuk dikirim ke server.
3. PUT
   Mengirim data ke server untuk membuat maupun memperbarui resource, bersifat idempoten memanggil data yang sama berulang kali tidak akan mempengaruhi data yang terdapat dalam server berbeda dengan yang di POST jika memanggil request POST dengan request yang sama akan memanggil request tersebut secara berulang-ulang.
4. DELETE
   Menghapus data yang sudah ada

### REST API Component

1. Method (GET, POST, PUT, DELETE)
2. URL (Base URL + Path) = URL adalah terdiri dari kata kunci yang menuju ke server.
3. HEADER adalah kumpulan field dan value yang berisi informasi otenfikasi yang memberitahu pesan tersebut sah.
4. BODY
   Mendefinisikan paramater apa yang dikirim ke server.

- JSON
  JavaScript Object Notation : format data untuk format penyimpanan data dan pertukaran data dan merupakan bagian javascript bisa dibaca di berbagai bahasa pemograman seperti C, C#, JavaScript dll.

- HTTP Response Code

1. 200 = OK
2. 201 Created (POST)
3. 400 Bad Request = Method POST and PUT tetapi datanya tidak sesuai maupun kesalahan dalam format
4. 404 Not Found = Resource tidak ditemukan
5. 401 Unauthorized = Terjadi karena kita tidak melakukan autentifikasi terlebih dahulu sebelum melakukan request.
6. 405 Method Not Allowed = Request tidak support
7. 500 Internal = Error server

## API Testing

- API testing adalah test yang dilakukan pada layer dimana API (Application Program Interface) yang di desain untuk berinteraksi/komunikasi pada aplikasi di pastikan functionalitasnya, melalui rangkaian atau set dari sebuah test. Sederhanannya API testing diharapkan bisa memberikan gambaran tentang bagaimana response dari aplikasi web tanpa atau sebelum GUI nya siap atau dalam proses.
- Sederhanannya API testing diharapkan bisa memberikan gambaran tentang bagaimana response dari aplikasi web tanpa atau sebelum GUI nya siap atau dalam proses.
- API testing sangat berbeda dengan GUI.

### Kind of API Testing

### 1. Functionality

untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum.

### 2. Load Test

untuk menguji kekuatan ke sistem apakah mampu mengolah data dari beban yang diberikan.

### 3. Security

untuk menguji keamanan suatu sistem.

### API Testing Tools

- PostMan
- Frisby
- JMeter
- Rest-assured

## Difference between API Test & Unit Test

### Unit Test

- Dilakukan oleh developer
- Fungsi-fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasar functionality yang di test
- Scopenya terbatas
- Biasanya dilakukan sebelum build

### API Test

- Tester perform it
- End to End
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build

### API Testing Process

### 1. Specification Review

untuk mereview dari spesifikasi API dan dokumen.

### 2. Specification Development

memastikan detail dokumen mengenai condition dan ekspektasi hasilnya di setiap test case.

### 3. Framework Development

memilih untuk memakai tools apa pada API testing nanti.

### 4. Test Case Development

membuat test scenario mupun test case nya.

### 5. Execution & Report

Mengeksekusi test case dan membuat report hasil dari testing .

### Test Case API Testing

- Mendapatkan response yang sesuai dengan inputan
- Apakah memberikan balikan atau tidak
- Apakah mengganggu fitur yang lain atau tidak
- Update struktur data
- Memodifikasi data yang ada.

### Best Practice of API Testing

- Kelompokkan test case kedalam beberapa kategori
- Beri judul yang sesuai pada setiap test
- Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapsu sesuatu
- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API

### Types of Output of an API

- Bisa berbentuk apa saja, tapi pada umumnya JSON atau XML
- Response apakah Pass atau Fail
- Memanggil fungsi API lain

### Common Types of Test in API Testing

- Memverifikasi apakah kita mendapat respon dari API
- Memverifikasi apakah hasil input/request sudah sesuai atau belum
- Memverifikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah
- Memverifikasi waktu response yang dibeirkan

### Types of Bugs that API testing detects

- Gagal melakukan error handling pada keadaan tertentu
- Kesulitan untuk tersambung dan mendapat respon API
- Isu keamanan
- Performance issues
- Error atau warning yang tidak tepat
- Struktur dari data respon tidak benar (JSON & XML)

### Advantages of Testing API

- Efisiensi waktu
- Bahasa yang independen
- Mengurangi biaya testing
- Mengurangi resiko

### Challenges of API Testing

- Kombinasi parameter, pemilihan parameter
- Tidak ada GUI
- Kita harus mengetahui terlebih dahulu parameter
- Perlu juga mengetest error handling dari setiap API.
