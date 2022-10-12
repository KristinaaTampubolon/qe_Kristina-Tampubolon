# Introduction JMeter and Tutorial Record with JMeter

#### Tools

1. Apache JMeter
2. k6
3. LOCUST
4. BlazeMeter
5. SMARTBEAR LoadNinja

## JMeter

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi dekstop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.

### Pros of JMeter

- Open Source
- Easy to use with GUI/ Non GUI

### Komponen skrip JMeter

- Test Plan
  Rencana besar tes yang akan dilakukan (parent)
- Thread Groups
  Sekelompok utas menjalankan skenario yang sama
- Sampler / Samplers
  request yang dikirim ke server
- Config elements
  Elemen yang digunakan untuk konfigurasi atau modifikasi sampier requests yang dikum ke server
- Listeners
  Perekam data yang dihasilkan dan tes
- Timers
  Fitur ini akan jalan duluan sebelum semua fitur yong loin berjalan
- Assertions
  kriteria tambahan apakah lulus/tidak
- Pre-post processors
  Fitur yang memproses response data sebelum/sesudah tes
