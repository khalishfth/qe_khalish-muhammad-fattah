# (9) From Manual to Automation Testing & Behaviour Driven Development

## Materi 1: From Manual to Automation Testing

### Poin Pertama
Poin pertama menjelaskan tentang Perbedaan manual dan automation testing, Proses dari manual testing, Proses dari automation testing. Perbedaan manual dan automation testing terletak pada metode pengujian perangkat lunak. Manual testing dilakukan secara manual oleh manusia, sedangkan automation testing menggunakan tools atau software untuk menjalankan test case secara otomatis. Proses dari manual testing meliputi tahap perencanaan, desain test case, eksekusi test case, dan pengumpulan hasil. Sedangkan proses dari automation testing meliputi identifikasi test case yang dapat diotomasi, pembuatan skenario pengujian, scripting test case, eksekusi test case secara otomatis, dan pengumpulan hasil.

### Poin Kedua
Poin kedua menjelaskan tentang Pengertian manual testing, Tujuan manual testing, Kelebihan dan kekurangan dari manual testing. Manual testing adalah metode pengujian perangkat lunak yang dilakukan secara manual oleh manusia. Tujuan dari manual testing adalah untuk menemukan bug atau kekurangan pada perangkat lunak yang diuji. Kelebihan dari manual testing adalah fleksibilitas, keakuratan, dan efektivitas dalam pengujian kasus uji yang kompleks. Namun, kelemahan dari manual testing adalah biaya dan waktu yang dibutuhkan untuk melakukan pengujian yang besar, serta dapat menghasilkan kesalahan manusia dalam pengujian.

### Poin Ketiga
Poin ketiga menjelaskan tentang Pengertian automation testing, Tujuan automation testing, Ciri-ciri test case yang bisa diotomasi dan yang tidak. Automation testing adalah metode pengujian perangkat lunak yang menggunakan tools atau software untuk menjalankan test case secara otomatis. Tujuan dari automation testing adalah untuk meningkatkan efisiensi dan akurasi dalam pengujian perangkat lunak. Ciri-ciri test case yang bisa diotomasi antara lain memiliki skenario pengujian yang serupa atau berulang, stabil dan dapat diprediksi, dan memerlukan pengujian yang berulang-ulang. Sedangkan test case yang tidak bisa diotomasi antara lain yang memerlukan interaksi manusia yang kompleks, seperti pengujian pengalaman pengguna (user experience).

## Materi 2: Behaviour Driven Development

### Poin Pertama
Poin pertama menjelaskan tentang Pengertian BDD, Kelebihan BDD dan Fungsi BDD. DD (Behavior Driven Development) adalah metodologi pengembangan perangkat lunak yang berfokus pada perilaku atau behavior dari sistem yang dibangun. Kelebihan dari BDD adalah mampu meningkatkan kualitas perangkat lunak dan memudahkan pengembang dalam memahami kebutuhan dan spesifikasi dari sistem. Fungsi BDD adalah untuk menjamin bahwa perangkat lunak yang dibangun sesuai dengan kebutuhan pengguna.

### Poin Kedua
Poin kedua menjelaskan tentang Pengertian Cucumber, Format BDD, Pengertian Gherkin Cucumber dan contohnya. Cucumber adalah salah satu tool yang digunakan dalam BDD. Cucumber menggunakan format BDD yang menggabungkan bahasa alami dan kode, sehingga memudahkan pengguna untuk memahami skenario yang dibangun. Gherkin Cucumber adalah bahasa yang digunakan dalam format BDD. Contoh penggunaan Gherkin Cucumber adalah sebagai berikut: 

`Feature: Login
  As a user
  I want to login into the application
  So that I can access my account

  Scenario: Valid Login
    Given I am on the login page
    When I fill in "Username" with "user1"
    And I fill in "Password" with "password1"
    And I press "Login"
    Then I should see "Welcome user1"`


### Poin Ketiga
Poin ketiga menjelaskan tentang Cara membuat scenario BDD dengan Cucumber dan tools-tools yang dibutuhkan untuk demo dengan Cucumber. Untuk membuat scenario BDD dengan Cucumber, pertama-tama kita perlu membuat file feature yang berisi skenario pengujian. Selanjutnya, kita dapat menuliskan skenario pengujian menggunakan bahasa Gherkin Cucumber. Untuk demo dengan Cucumber, kita membutuhkan beberapa tools seperti Cucumber, Selenium Webdriver, dan bahasa pemrograman seperti Java atau Ruby.
