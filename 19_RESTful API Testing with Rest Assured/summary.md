# REST API TESTING

1. REST : standard arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web umumnya menggunakan HTTP sebagai protokol sebagai komunikasi data.

2. REST API berisi aturan yang membatasi programmer dalam melakukan tindakan tertentu, terdapat request dan response pada data yang dikirimkan atau diterima , data biasanya yang diterima adalah JSON.

## Fundamental API

1. Record, Define API Information (Definisikan API yang akan ditest) inputkan data baik di header maupun di body request
2. Parsing , Filter of Recording API DATA And then extract
3. Reconstruction API calls and sent them from a simulate a client
4. Test Validation

## The Practical Test Pyramid

Test Pyramid dikelompokkkan ke dalam berbagai kategori.

1. UNIT Testing : pengujian perangkat lunak yang menguji sebuah perangkat lunak. UNIT testing dilakukan pada saat masa pengembangan atau pada saat menuliskan kode program yang diuji dalam hal ini adalah unit unit dari prangkat lunak. UNIT dapat berupa function, method ,procedure, module maupun objek.
2. Komponen Testing : pengujian perangkat lunak dimana pengujian dilakukan pada setiap komponen terpisah tanpa mengintegrasikan dengan komponen lain. Salah satu black box testing yang dilakukan QA.
3. Integration Testing : pengujian dari hasil penggabungan unit unit yang ada di dalam software. Integration testing sebaaiknya dilakukan bertahap jika terdapat error.
4. UI Test (End To End)
