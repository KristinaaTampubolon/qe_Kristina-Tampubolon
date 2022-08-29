## TASK 1

Dari gambar mutation report dapat kita lihat bahwa :

- Test dengan nama com.hashcode.tutorial.entity memiliki line coverage = 67% yang berarti terdapat 6 baris yang berhasil dieksekusi dari 9 jumlah totalnya
- Diperoleh mutation coverage sebesar 67%, dimana terdapat 3 mutan. 2 diantaranya killed (terbunuh) dan 1 selamat
  Oleh sebab itu dapat disimpulkan bahwa testcase tersebut masih inadequate (belum memadai/layak) karena suatu testcase disebut memadai/layak(adequate) jika skor mutasinya adalah 100%

- Test dengan nama com.hashcode.tutorial.service memiliki line coverage = 100% yang berarti keseluruhan (6/6) baris berhasil dieksekusi
- Diperoleh mutation coverage sebesar 75%, dimana terdapat 4 mutan. 3 mutan diantaranya killed(terbunuh) dan 1 diantaranya selamat
  Oleh sebab itu Oleh sebab itu dapat disimpulkan bahwa testcase tersebut masih inadequate (belum memadai/layak) karena suatu testcase disebut memadai/layak(adequate) jika skor mutasinya adalah 100%

Rumus untuk **Mutation Score = 100 \* D / (N - E)**

- D = Dead mutants
- N = Number of mutants
- E = Number of equivalent mutants

## TASK 2

Dari gambar source code tersebut dapat kita lihat bahwa :

- Terdapat class CalculatorServiceImpL dengan dua operasi/fungsi

1. add : parameter dengan tipe int dan operasinya(penambahan) ditampung pada variable c.
   warna hijau menujukkan line coverage
2. substract : parameter dengan tipe int dan operasinya(pengurangan) ditampung pada variable c.
   warna merah menunjukkan surviving mutants(mutants yang bertahan)
