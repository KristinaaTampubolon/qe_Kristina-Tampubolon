## Fundamental Perfomance Test

1. Performance Test
   Performance test merupakan teknik non-functional testing untuk menentukan parameter sistem dalam hal responsive dan stabilitas di bawah berbagai beban (load kerja). Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan, dan penggunaan resources. Hasil pengujian biasanya berupa number of virtual users.
   Apakah hasil pengujian sudah sesuai tidak

2. Apa Yang Diukur Dari Perfomance Test ?

- Perfomance suatu aplikasi sampai suatu batas tertentu
- Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada environmentnya

## Metode Performance Test

1. Membuat Test Plan

2. Kenali yang dibutuhkan:

- Endpoint yang akan diuji:
  - /login
  - /beli_pulsa
  - /cek_out
- Kebutuhkan masing-masing endpoint:
  - Username dan password untuk endpoint /login
  - Produk, denom dan nomor untuk pengujian untuk endpoint /beli_pulsa
  - Metode pembayaran yang dipilih untuk endpoint /cek_out

3. Menentukan Metode Test

### Tipe-tipe Performance Testing

#### Smoke Testing

Smoke Testing adalah sejenis software yang dilakukan setelah perangkat lunak di build untuk memastikan bahwa fungsi penting dari program ini bekerja dengan baik. Ini dijalankan “sebelum” setiap tes fungsional atau regresi rinci dijalankan pada perangkat lunak membangun. Tujuannya adalah untuk menolak aplikasi yang rusak parah, sehingga tim QA tidak membuang waktu menginstal dan menguji aplikasi perangkat lunak.

#### Load Testing

Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.
Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak.

#### Table Tier

Table Tier ini bisa dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.

#### Stress Testing

Stress testing digunakan untuk menguji stabilitas dan keandalan sistem. Tes ini dapat menentukan sistem pada ketahanan dan penanganan kesalahan dalam kondisi beban yang sangat berat sehingga memastikan bahwa sistem tidak akan crash di bawah situasi krisis.

#### Spike Testing

Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak.

#### Soak Testing

Soak Testing adalah menjalankan sistem pada beban tinggi untuk jangka waktu yang lama. Tujuannya adalah untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam) serta mengetahui apakah terdapat bug pada race condition, memory leaks, db connections, dll.

### Istilah-istilah Penting pada Performance Testing

- System Under Test (SUT) : Sebutan untuk sistem yang sedang dilakukan test
- Load Generator : Sebutan untuk server yang digunakan untuk mmebuat request
- Throughput : Satuan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM)
- Performance Threshold : Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, Max CPU usage 70%, dsb
- Saturation : Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.
- Virtual Users : Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi.
- Response time : Lama waktu pengiriman request hingga menerima response.
