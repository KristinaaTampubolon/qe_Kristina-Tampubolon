# ITERABLE DATA STUCTURE

Iterable : Sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan.

### Java Iterable

1.  Iterable adalah struktur tertinggi dalam hirarki dalam bahasa pemograman java
2.  Collection
    Collection adalah sebuah objek yang mewakili kumpulan dari suatu objek.
3.  - Set (SortedSet, NavigableSet)

    * List

      List : jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda.

    - Queue
      Queue : sekumpulan data yang mana penambahan elemen hanya bisa dilakukan pada suatu ujung yang disebut sisi belakang (rear), dan penghapusan (pengambilan elemen) dilakukan lewat ujung lain.

      - Antrian disebut sebagai daftar First In First Out.

    - Deque

    * Deque(double-ended queue) adalah koleksi linier yang mendukung penyisipan dan penghapusan elemen dari kedua ujungnya.

### Java List Implementation

1. Abstract Collection
   Abstract Collection : untuk menerapkan koleksi yang tidak dapat dimodifikasi.

2. Abstract List

- Abstract List : untuk mengimplementasikan koleksi yang tidak dapat dimodifikasi

- Kelas ini menyediakan implementasi kerangka antarmuka Daftar untuk meminimalkan upaya yang diperlukan untuk mengimplementasikan antarmuka ini yang didukung oleh penyimpanan data Akses Acak (seperti larik). Untuk data akses sekuensial (seperti daftar tertaut), AbstractSequentialList harus digunakan dalam preferensi untuk kelas ini.

3. Array List
   Array List digunakan pada saat memberi array dinamis di Java.

4. Abstract SequentialList
   Digunakan untuk mengimplementasikan daftar yang tidak dapat dimodifikasi, memperluas Kelas AbstractList ini dan hanya mengimplementasikan metode get() dan size()

5. LinkedList

- Linked List adalah suatu struktur data linier. , linked list dibentuk secara dinamik.
- Terdiri dari beberapa blok memori di alamat yang berbeda.

6. Stack

- Kelas Stack mewakili tumpukan Last In First Out (LIFO).
- Operasi push dan pop yang biasa disediakan

7. HashSet

- HashSet merupakan class yang sering digunakan untuk menyimpan collection yang bebas duplikasi.
- HashSet menyimpan elemen dengan menggunakan mekanisme yang disebut hashing
- HashSet hanya berisi elemen unik. HashSet memungkinkan nilai nol. Kelas HashSet tidak disinkronkan.
- HashSet tidak mempertahankan urutan penyisipan. Di sini, elemen dimasukkan berdasarkan kode hashnya.
- HashSet adalah pendekatan terbaik untuk operasi pencarian. Kapasitas default awal HashSet adalah 16, dan faktor bebannya adalah 0,75.

8. JavaLinkedHashSet

- Java LinkedHashSet adalah pengimplementasian set antarmuka dan memperluas kelas HashSet. Ini menggunakan penerapan daftar tertaut ganda pada hashtable. Artinya, ia mempertahankan urutan penyisipan saat melakukan iterasi melalui elemen
- Kelas Java LinkedHashSet berisi elemen unik hanya seperti HashSet.
- Kelas Java LinkedHashSet menyediakan semua opsional
- Mengatur operasi dan mengizinkan elemen nol.
- Kelas Java LinkedHashSet tidak disinkronkan. Kelas Java LinkedHashSet mempertahankan urutan penyisipan.

9. EnumSet

- EnumSet dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama
- Itu tidak memungkinkan untuk menambahkan nilai nol, melemparkan, NullPointerException dalam upaya untuk melakukannya Itu tidak aman untuk thread, jadi kami perlu menyinkronkannya secara eksternal jika diperlukan
- Elemen disimpan mengikuti urutan di mana mereka dideklarasikan di enum
- Ini menggunakan iterator gagal-aman yang berfungsi pada salinan, sehingga tidak akan mengeluarkan Pengecualian ConcurrentModification jika koleksi dimodifikasi saat mengulanginya.

10. Sorted Set

- Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya.
- Elemen-elemen diurutkan baik dengan menggunakan pengurutan alami atau dengan menggunakan Pembanding. Semua elemen yang dimasukkan ke dalam set yang diurutkan harus mengimplementasikan antarmuka Sebanding.
