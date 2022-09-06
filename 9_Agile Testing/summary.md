# AGILE TESTING

## SDLC

SDLC adalah proses yang digunakan untuk merancang, mengembangkan serta menguji kualitas software.

## Tujuan SDLC

1. Menyediakan alur terstruktur dalam membantu organisasi menghasilkan produk yang berkualitas tinggi.
2. Menciptakan produk dengan perkiraan waktu yang singkat dengan biaya yang rendah.
3. Menciptakan produk/software yang memenuhi harapan pelanggan.
4. SDLC berperan sebagai Sebagai sarana komunikasi antara tim developer dengan pemegang kepentingan.
5. SDLC membagi peranan dan tanggung jawab yang jelas antara developer, designer, business analyst dan juga manajer proyek
6. SDLC memberikan gambaran input emberikan gambaran input, output yang jelas dari satu tahap menuju tahap selanjutnya.

- Langkah-Langkah SDLC

1. Mengevaluasi sistem yang ada untuk mendefinisikan persyarata yang ada pada sistem baru
2. Mengantisipasi adanya pengerjaan ulang atau perbaikan setelah proses pembangunan software berhasil dilakukan.
3. SDLC adalah metode berulang sehingga perlu diperhatikan pada setiap langkah setiap kualitas code yang ada di setiap siklus.

#### Tahap dalam SDLC

1. Requirement Gathering
   Pada tahap ini sistem akan dianalisis bagaimana akan dijalankan nantinya. Hasil analisis berupa kelebihan dan kekurangan sistem, fungsi sistem hingga pembaharuan yang dapat diterapkan. Bagian ini termasuk bagian perencanaan. Bagian lain yang termasuk bagian perencanaan adalah alokasi sumber daya, perancanaan kapasitas, penjadwalan proyek, estimasi biaya, dan penetapan. Dengan demikian, hasil dan tahap ini ialah rencana proyek, estimasi biaya, dan ketentuan. Idealnya manajer proyek dan developer dapat bekerja maksimal pada tahap ini.

2. Design
   Tahap design : membuat model cara kerja aplikasi software. aspek yang diperhatikan dalam tahapan desain antara lain:

- Communications
  Communication adalah proses/cara kita berkomunikasi dengan aset lain seperti server pusat, programmer dan aplikasi lainnya.

- Programming
  Pada proses ini yang penting tidak hanya bahasa pemograman tetapi metode pemecahan masalah dan tugas-tugas yang ada di dalam aplikasi/

- Architecture
  Menentukan bahasa pemograman, praktik dalam industri, desain keseluruhan dan penggunaan template tertentu.

- User Interface
  mendefiniskan bagaimana cara pelanggan berinteraksi dengan software dan bagaimana software tersebut merespon input yang ada.

- Platform
  Mendefinisikan platform/software tersebut akan dijalankan seperti Android, IoS, Linux atau game console.

- Security
  Mendefiniskan langkah-langkah untuk mengamankan aplikasi, misalnya membuat perlindungan kata sandi, enkripsi SSL traffic atau membuat penyimpanan kredensial pengguna lain.
  Mambuat prototie juga dapat menjadi bagian dari tahapan desain dalam SDLC. Prototipe sendiri menjadi versi awal dari software dalam model pengembangan software yang berulang. Prototipe akan mendemostrasikan ide dasar bagaimana aplikasi dapat terlihat dan bekerja, desain ini dapat ditunjukkan kepada pemangku kepentingan untuk mendapatkan umpan balik yang berguna untuk meningkatkan aplikasi software tersebut.

3. Development (Code)
   Pada tahap ini dimana program/code ditulis.

4. Testing
   Proses Testing dilakukan sesudah sistem selesai dibangun, sebelum sistem tersebut dipublish/dirilis sitem harus terlebih dahulu diuji, ada beberapa pengujian yang harus dilakukan antara lain :
   eberapa pengujian yang harus dilewati, antara lain kualitas kode, tes fungsional, integration testing, performance testing, dan security testing.

5. Deployment
   Proses Deplyoment dilakukan jika plikasi sudah tersedia pada pelanggan untuk digunakan. Contohnya beberapa perusahaan mungkin perlu melakukan pembaruan database ke aplikasi yang baru dikembangkan sehingga memakan lebih banyak waktu dan tenaga. Tahapan ini bukan menunjukkan bahwa setiap tahap SDLC sudah selesai. Berbagai feedback yang disampaikan oleh user juga harus didengarkan lagi. Bila perlu, akan ada penyesuaian lagi terhadap produk.

6. Maintenance
   Proses Maintenance adalah proses pemeliharaan yang perlu dilakukan agar aplikasi tetap berjalan dengan lancar.

#### Model-Model SDLC

1. Waterfall Model
   Waterfall model adalah model tertua dan tersingkat dalam penerapannya. Dalam sistem ini, setelah satu fase selesai, fase berikutnya harus segera dimulai.Setiap fase memiliki rencana kecil dan menurun ke fase berikutnya. Maka dari itu, fase ini dikatakan waterfall atau air terjun karena tiap fase memiliki ‘turunan’ kecil lainnya.
   Ada beberapa kekurangan pada model ini yaitu jika ada satu detail kecil tertingal maka proses keseluruhan akan berakhir dan berantakan.

2. Agile Model
   Agile model adalah model SDLC yang dapat memisahkan produk dengan proses dan waktu pengerjaannya secara cepat. Metodologi ini diyakini sangat efektif untuk keberhasilan penciptaan sebuah produk.
   Dalam metode ini, tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan. Namun, salah satu kelemahan dari metode ini dapat memicu proyek ke arah yang salah dan tidak sesuai dengan kemauan dan ekspektasi dari customer.

3. Iterative Model
   Metode SDLC ini adalah metode yang memiliki repetisi tinggi. Developer akan menciptakan produk dengan versi cepat dan murah.

4. V-Shaped Model
   V-shaped SDLC model adalah lanjutan dari Waterfall Model. Metode SDLC ini akan mencoba tiap fase dalam proses pengembangan suatu produk.

5. Big bang Model
   Big bang Model adalah salah satu software development life cycle ini adalah model yang diklaim memiliki risiko tinggi saat dijalankan.
   Kekurangan dalam metode ini yaitu pada proses pengerjaan yang tergolong berisiko karna di dalam pengerjaan tim akan menginvestasikan semua bahan baku ke dalam projek tersebut. Sehingga metode ini akan berhasil jika mengerjakan proyek yang kecil dan cenderung berbahaya untuk proyek besar.

6. Spiral Model
   Metode ini merupakan metode yang paling fleksibel dan mirip dengan iterative model. Metode ini fokus pada repetisi dalam pengerjaannya.

### 5 Kunci dalam Testing Manifesto

1. Testing is an activity not a phase
2. Prevent bugs rather than finding bugs
3. Don't be a checker, be a tester
4. Don't try to break the system, instead help build the best possible system
5. The whole team is responsible for quality, not just the tester

## Testing Pyramid

Testing Pyramid : strategi yang dapat membantu tim Pengembangan dan Otomasi membuat perangkat lunak pengujian berkualitas tinggi dan andal.
Ini mengurangi waktu yang dibutuhkan tim untuk mengidentifikasi apakah perubahan yang mereka lakukan merusak sistem dengan menawarkan umpan balik langsung. Testing pyramid yang beroperasi pada tiga tingkat membantu mengurangi jumlah waktu yang dihabiskan tim otomatisasi dalam pelaksanaan test case dengan mengkategorikan setiap fitur baru ke dalam satu atau semua test.

### Level Testing Pyramid

#### Unit Test

Unit test merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen sebuah perangkat lunak. Unit testing dilakukan pada masa pengembangan atau pada saat menuliskan code program perangkat lunak dari si developer. Seperti namanya, komponen yang diuji pada unit testing adalah unit-unit dari perangkat lunak. Unit disini dapat berupa function, method, procedure, module, maupun object. Tujuan dari unit testing adalah untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.

#### Integration Testing

Integration testing adalah pengujian dari hasil penggabungan unit yang ada di dalam software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi sebagai suatu unit yang individual. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error / bug.

#### UI Test (end-to-end test)

UI test adalah yang paling dekat dengan interaksi pengguna pada aplikasi web atau android atau ios. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status UI harus berubah seperti yang diharapkan. Ini adalah testing dengan tingkatan tertinggi. Dengan menggunakan alat atau kerangka kerja, uji E2E memberi tahu browser apa yang harus dilakukan, klik, ketik, dan kemudian harapkan perilaku aplikasi berdasarkan tindakan. Adalah baik untuk memiliki cakupan penuh dengan tes unit dan integrasi.
Kesimpulan Testing Pyramid
