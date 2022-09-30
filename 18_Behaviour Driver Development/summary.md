## Behaviour Driven Development

### What is BDD

TDD merupakan Proses software development yang menerapkan penulisan testcase sebelum developer menuliskan production codenya berfokus pada componen dalam sistem dan test case ditulis dalam bahasa pemograman.
BDD merupakan penerapan test case yang sama dengan TDD namun dengan fokus yang berbeda, dalam BDD test tim developer akan menuliskan berbagai skenario yang menjelaskan behaviour sistem dari perspektif pengguna.

### BDD Format

- Feature file dalam BDD ditulis dalam bahasa Gerkins yang dapat dipahami oleh siapapun sehingga non technical dapat memahami aspek bisnis yang sedang dilakukan.

Tahapan BDD

1. User Story
2. - As a [x]
   - I Want [Y]
   - So that [z]
3. Scenario
4. - Given - When - Then
     Prinsip dasar dari BDD adalah mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci.

#### Tahapan BDD

- Tahap 1 — Menentukan user stories; untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
- Tahap 2 — Menuliskan skenario (dalam feature files, menggunakan Gherkin) berdasarkan user stories
- Tahap 3 — Mengimplementasikan test script (dalam step files) berdasarkan skenario
  Terdapat 3 keyword sebagai elemen utama dalam skenario BDD:
- Given — menjelaskan konteks dari skenario
- When — menjelaskan tindakan yang dilakukan oleh user
- Then — menjelaskan outcome dari tindakan yang dilakukan oleh user

## Cucumber

Cucumber adalah sebuah tool yang mendukung BDD. Cucumber membaca semacam ketentuan yang dapat dieksekusi.
