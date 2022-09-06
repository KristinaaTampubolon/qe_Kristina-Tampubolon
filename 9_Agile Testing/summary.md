# AGILE TESTING

## SDLC

- Pengertian SDLC
  SDLC adalah proses yang digunakan untuk merancang, mengembangkan serta menguji kualitas software.

- Tujuan SDLC

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

####Tahap dalam SDLC

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
   Kalau kita melihat proses development yang lama (mungkin dari kita masih ada yang menggunakan), dapat kita lihat proses testing aplikasi dilakukan di akhir proses development. Dengan cara lama tersebut seorang tester akan kewalahan di akhir proses development karena dia harus melakukan full test aplikasi yang belum pernah dia test sebelumnya. Dalam testing manifesto tester dianjurkan untuk melakukan testing beriringan dengan proses development, jadi tidak terpisah atau membentuk fase sendiri melainkan jadi satu dengan proses development.

2. Prevent bugs rather than finding bugs
   Hal yang penting pada saat proses pembangunan adalah mencegah bugs daripada menemukan bug oleh karena itu sesama tim harus bekerja sama dengan baik agar aplikasi yang diciptakan baik dengan melakukan proses requirement gathering yang detail dan lengkap agar pada saat proses pembangunan kesalahan dapat diminimalisir sekecil mungkin.

3. Don't be a checker, be a tester
   Sebagai seorang tester, tidaklah cukup jika hanya melakukan testing tanpa adanya improvement / masukan terhadap apa yang test. Jika seorang tester hanya melakukan pengecekan fungsional dan tidak memahami seperti apa kebutuhan user yang akan menggunakan aplikasi maka peran seorang tester akan dipertanyakan ketika semua test sudah otomatis. Disinilah peran tester sebenarnya dibutuhkan, bagaimana dia bisa memberikan feedback terhadap apa yang sedang di test.

4. Don't try to break the system, instead help build the best possible system
   Di dalam proses testing, seorang QA akan melakukan positif test dan negative test. Seorang QA yang baik adalah mengingat tujuan utama dari proses development tersebut bukan untuk menemukan keburukan sehingga untuk menciptakan software yang berkualitas maka seorang QA harus memberikan saran sebaik mungkin kepada Developer agar proses pengembangan software berjalan dengan lancar.
5. The whole team is responsible for quality, not just the tester
   Mengingat tanggung jawab seluruh tim untuk kualitas adalah prinsip dasar Agile. Beban dari kualitas product yang dibangun tidak semestinya dibebankan pada salah satu anggota saja. Misalnya ada bug yang baru ditemukan saat product sudah launcing, tidak semerta-merta tanggung jawab itu dibebankan pada seorang QA yang mungkin tidak teliti atas bug tersebut, bukan juga dengan membebankan developer. Namun setiap anggota tim bertanggung jawab berlandaskan kepemilikan bersama atas product yang dibangun.

## Testing Pyramid

Testing Pyramid adalah strategi yang dapat membantu tim Pengembangan dan Otomasi membuat perangkat lunak pengujian berkualitas tinggi dan andal. Ini mengurangi waktu yang dibutuhkan tim untuk mengidentifikasi apakah perubahan yang mereka lakukan merusak sistem dengan menawarkan umpan balik langsung. Testing pyramid yang beroperasi pada tiga tingkat membantu mengurangi jumlah waktu yang dihabiskan tim otomatisasi dalam pelaksanaan test case dengan mengkategorikan setiap fitur baru ke dalam satu atau semua test.

### Level Testing Pyramid

#### Unit Test

Unit test merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen sebuah perangkat lunak. Unit testing dilakukan pada masa pengembangan atau pada saat menuliskan code program perangkat lunak dari si developer. Seperti namanya, komponen yang diuji pada unit testing adalah unit-unit dari perangkat lunak. Unit disini dapat berupa function, method, procedure, module, maupun object. Tujuan dari unit testing adalah untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.

#### Integration Testing

Integration testing adalah pengujian dari hasil penggabungan unit yang ada di dalam software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi sebagai suatu unit yang individual. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error / bug.

#### UI Test (end-to-end test)

UI test adalah yang paling dekat dengan interaksi pengguna pada aplikasi web atau android atau ios. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status UI harus berubah seperti yang diharapkan. Ini adalah testing dengan tingkatan tertinggi. Dengan menggunakan alat atau kerangka kerja, uji E2E memberi tahu browser apa yang harus dilakukan, klik, ketik, dan kemudian harapkan perilaku aplikasi berdasarkan tindakan. Adalah baik untuk memiliki cakupan penuh dengan tes unit dan integrasi.
Kesimpulan Testing Pyramid:

1. Semakin tinggi level yang Anda dapatkan, semakin sedikit tes yang harus Anda lakukan.
2. Tulis tes dengan tingkat detail yang berbeda.
3. Bahkan kami dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk diuji. Tetapi kami tidak dapat menguji semua gaya atau apakah UI cocok dengan desain. Itulah mengapa tes tingkat tinggi harus fokus pada skenario penting.

## TASK

1. Pada fase apa saja QE berperan pada proses SDLC? Sebutkan dan jelaskan peran seperti apa yang QE dapat lakukan pada setiap fase tersebut!
   Jawab :
   Dalam setiap tahapan yang ada di dalam SDLC QE berperan
   Ada 2 tahapan yang terdapat pada fase SDLC antara lain:

   1. Requirements Gathering
      Pada tahap Requirements Gathering merupakan tahap perencaaan dalam mengidentifikasi dan menentukan scope serta ruang lingkup pemgembangan proyek,
      QE berperan untuk menentukan beberapa langkah yang akan dilakukan pada tahap planning untuk memperkirakan resiko yang akan datang ke depannya , serta menganalisis kebutuhan user
      agar sistem yang akan dibangun akan dapat memenuhi kebutuhan client. Jika proses Requirement Gathering baik dilaksanakan maka proses selanjutnya akan berjalan dengan baik.

   2. Design
      Pada tahap ini adalah membangun desain yang sudah dirancang pada proses requirement gathering, dimana QE berperan menganalisa desain yang dibangun oleh seorang UI/UX apakah sudah baik (Hall of Fame) dan apakah desain yang sudah dirancang memenuhi syarat untuk dipakai.

   3. Development(Code)
      Pada tahap Devekopment adalah tahap pengembangan software dimana software yang telah dirancang dan didesain akan dibangun dengan menggunakan teknologi serta bahasa pemograman yang dipilih.
      Tahap development adalah tahap terlama dalam proses SDLC, dalam proses pengembangan QA sudah dapat merancang test case yang kemungkinan akan digunakan serta dapat mencek beberapa fungsi yang
      sudah dibangun, jika ada sesuatu seperti code yang dicurigai kurang vulnerable dan masih ada fungsi yang error maka QA dan Developer harus bekerjasama untuk memperbaiki fungsi yang sedang dibangun agar proses kedepannya menjadi lebih baik dan menghindari
      bug yang akan terjadi pada saat software selesai dibangun.

   4. Testing
      Pada tahap ini QE akan mengeksekusi test case yang sudah dirancang sebelumnya test case yang dibuat terdiri dari dua yaitu positif dan negatif, dimana test case yang sudah dieksekusi didokumentasikan.
      Seorang QE juga harus menguji keseluruhan dari software yang dibangun seperti kemudahan penggunaan sampai pencapaian tujuan dari sistem yang sudah disusun sejak perancangan sistem dilakukan.

   5. Deployment
      Pada tahapan Deployment seorang QA harus memastikan apakah semua test case dan pengujian yang sudah dilakukan pada proses testing sudah berjalan dengan baik dan semua kegiatan sudah dilakukan.

   6. Maintenance
      Pada tahap Maintenance akan ada bug yang ditemukan oleh user maupun QA pada saat software sudah digunakan. Ketika ditemukan bugs yang tidak diprediksikan pada tahap testing,
      maka seorang developer akan memperbaiki bugs yang ditemukan tersebut, kemudian seorang QE juga harus membuat test case yang mungkin ada baik bersifat positif maupun negatif kemudian mengeksekusi test case tersebut.

2. Menurut teman-teman apa tantangan ketika menerapkan agile testing? Berikan penjelasan masing-masing
   5 poin agile testing manifesto!

   1. Testing is an activity not a phase
      Tantangan pada poin ini adalah masih banyak pola pikir Quality Assurance yang menilai bahwa testing dilakukan pada saat aplikasi sudah siap dibangun, dan jika ada error yang terjadi saat aplikasi dipakai
      maka itu adalah tugas developer , pada poin ini seorang Quality Assurance harus memiliki pola pikir bahwa proses testing harus dilakukan pada setiap tahap SDLC agar kualitas mutu pembangunan software berjalan
      dengan baik.

   2. Prevent bugs rather than finding bugs
      Tantangan pada poin adalah lebih sulit menentukan atau memperkirakan kemungkinan bugs yang terjadi tantangan disini adalah quality assurance harus berpikir kritis dalam menentukan bugs yang akan terjadi.

   3. Don't be a checker, be a tester
      Tantangan pada poin ini adalah mindset quality assurance bukan hanya mengtest tetapi harus mengetahui kebutuhan user dalam menggunakan aplikasi tersebut.

   4. Don't try to break the system, instead help build the best possible system
      Tantangan pda poin ini adalah menciptakan test case sebanyak mungkin yang dimana goal utamanya adalah menemukan bugs
      dan QA harus mampu memposisikan diri sebagai orang awam yang mencoba software tersebut.

   5. The whole team is responsible for quality, not just the tester
      Tantangan pada poin ini adalah seorang QA juga harus dapat memberikan saran mengenai kualitas suatu software tidak hanya mentest sofware tersebut.
