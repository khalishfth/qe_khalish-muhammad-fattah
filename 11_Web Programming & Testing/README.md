# (11) Web Programming & Testing

## Materi 1: Web Programming

### Poin Pertama
Poin pertama menjelaskan tentang Pengertian Frontend, Pengertian HTML, Kegunaan HTML, Tag-Tag HTML. 

- Frontend adalah salah satu bagian dari pengembangan web yang berfokus pada tampilan dan interaksi pengguna. Frontend mencakup teknologi-teknologi seperti HTML, CSS, dan JavaScript yang digunakan untuk merancang dan mengembangkan antarmuka pengguna pada website atau aplikasi web.

- HTML (Hypertext Markup Language) adalah bahasa markup yang digunakan untuk membuat struktur dan konten pada halaman web. HTML digunakan untuk menentukan elemen-elemen seperti judul, paragraf, gambar, video, dan tautan dalam sebuah halaman web. HTML berfungsi sebagai kerangka dasar untuk membangun sebuah website.

- Kegunaan HTML sangat penting dalam pengembangan web. HTML digunakan untuk membangun struktur dasar sebuah halaman web, seperti judul, paragraf, daftar, tabel, formulir, dan lain-lain. HTML juga digunakan untuk menyematkan berbagai jenis konten media seperti gambar, video, dan audio dalam sebuah halaman web.

- Tag-tag HTML adalah elemen-elemen yang digunakan dalam kode HTML untuk membangun struktur dan konten sebuah halaman web. Tag-tag HTML dimulai dengan tanda "<" (kurung siku buka) dan diakhiri dengan tanda ">" (kurung siku tutup). Beberapa contoh tag HTML umum yang digunakan adalah:

```
<h1>, <h2>, <h3>, <h4>, <h5>, <h6>: Tag ini digunakan untuk membuat judul dengan tingkatan yang berbeda. <h1> merupakan judul dengan tingkatan tertinggi, sedangkan <h6> merupakan judul dengan tingkatan terendah.

<p>: Tag ini digunakan untuk membuat paragraf.

<a>: Tag ini digunakan untuk membuat tautan atau hyperlink.

<img>: Tag ini digunakan untuk menyematkan gambar dalam halaman web.

<ul> dan <li>: Tag ini digunakan untuk membuat daftar tak-berurutan (unordered list) dan item dalam daftar tersebut.
```

### Poin Kedua
Poin kedua menjelaskan tentang Pengertian dan Kegunaan CSS, Pengertian dan Implementasi dari (External CSS, Internal CSS dan Inline CSS), Pengertian CSS Selector dan Implementasinya, Pengertian CSS Grouping dan Implementasinya.

- CSS (Cascading Style Sheets) adalah bahasa stylesheet yang digunakan untuk mengatur tampilan atau gaya suatu halaman web yang sudah dibangun dengan HTML. Dengan menggunakan CSS, pengembang web dapat mengontrol tata letak, warna, ukuran, dan gaya lainnya dari elemen-elemen HTML di dalam halaman web, sehingga dapat menciptakan tampilan yang menarik dan konsisten pada seluruh situs web.

- Pengertian dan Implementasi dari External CSS, Internal CSS, dan Inline CSS:

External CSS: External CSS adalah cara menghubungkan file CSS terpisah dari file HTML. Dalam external CSS, kode CSS ditulis dalam file terpisah dengan ekstensi .css dan dihubungkan ke dalam file HTML menggunakan tag <link>. Keuntungan menggunakan external CSS adalah memisahkan antara kode HTML dan kode CSS, sehingga memudahkan pemeliharaan dan pengelolaan tampilan pada situs web yang lebih besar dan kompleks.

Contoh implementasi external CSS pada file HTML:

```
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <!-- Konten HTML -->
</body>
</html>
```

Internal CSS: Internal CSS adalah cara menyematkan kode CSS langsung di dalam tag <style> dalam file HTML. Kode CSS di dalam internal CSS hanya berlaku untuk halaman HTML yang sama. Internal CSS cocok digunakan untuk halaman web yang sederhana atau memiliki tampilan yang khusus untuk halaman tertentu.

Contoh implementasi internal CSS pada file HTML:

```
<!DOCTYPE html>
<html>
<head>
  <style>
    /* Kode CSS */
  </style>
</head>
<body>
  <!-- Konten HTML -->
</body>
</html>
```

Inline CSS: Inline CSS adalah cara menambahkan kode CSS langsung pada atribut style di dalam tag HTML. Kode CSS di dalam inline CSS hanya berlaku untuk elemen HTML tertentu dan tidak dapat digunakan kembali pada elemen HTML lainnya. Inline CSS sebaiknya digunakan untuk perubahan tampilan yang sangat spesifik pada elemen HTML tertentu.

Contoh implementasi inline CSS pada tag HTML:

```
<!DOCTYPE html>
<html>
<head>
</head>
<body>
  <p style="color: blue; font-size: 18px;">Ini adalah paragraf dengan tampilan inline CSS</p>
</body>
</html>
```

- Pengertian CSS Selector dan Implementasinya:

CSS Selector adalah cara untuk memilih atau menargetkan elemen HTML yang akan diberikan gaya atau tampilan menggunakan CSS. Selector digunakan untuk mengidentifikasi elemen HTML yang akan diberikan pengaturan gaya tertentu.

Contoh implementasi CSS Selector:

```
/* Selector berdasarkan nama tag HTML */
p {
  color: blue;
  font-size: 16px;
}

/* Selector berdasarkan atribut class pada elemen HTML */
.my-class {
  color: red;
  font-size: 14px;
}

/* Selector berdasarkan atribut id pada elemen HTML */
#my-id {
  color: green;
  font-size: 12px;
}
```

- Pengertian CSS Grouping dan Implementasinya:

CSS Grouping adalah cara untuk mengelompokkan beberapa selector menjadi satu aturan CSS. Hal ini memungkinkan pengembang web untuk memberikan gaya yang sama kepada beberapa elemen HTML dengan kode CSS yang lebih efisien.

Contoh implementasi CSS Grouping:

```
/* Menggunakan grup selector untuk memberikan gaya yang sama pada beberapa elemen HTML */
.header, .footer {
background-color: gray;
padding: 10px;
}

/* Menggunakan grup selector untuk memberikan gaya yang sama pada beberapa elemen HTML dengan atribut class yang berbeda */
.button-primary, .button-secondary {
background-color: blue;
color: white;
padding: 5px 10px;
}
```


### Poin Ketiga
Poin ketiga menjelaskan tentang Pengertian dan Kegunaan Frontend Framework, Contoh Frontend Framework, Pengertian Bootstrap dan Keunggulannya

- Pengertian dan Kegunaan Frontend Framework:

Frontend Framework adalah kumpulan dari berbagai teknologi atau komponen yang digunakan untuk membangun antarmuka pengguna (UI) suatu aplikasi web. Frontend Framework menyediakan struktur, komponen, dan gaya yang sudah siap pakai sehingga memudahkan pengembang web dalam membangun tampilan yang menarik dan responsif tanpa harus membuat semuanya dari awal.

- Contoh Frontend Framework:

Bootstrap: Bootstrap adalah salah satu Frontend Framework yang paling populer dan banyak digunakan. Bootstrap menyediakan kumpulan komponen UI seperti grid system, form, button, navbar, dan masih banyak lagi, serta gaya CSS yang sudah siap pakai. Bootstrap juga menyediakan JavaScript plugin untuk memperkaya interaksi pengguna dalam aplikasi web.

- Pengertian Bootstrap dan Keunggulannya:

Bootstrap adalah sebuah Frontend Framework yang dikembangkan oleh Twitter. Bootstrap menyediakan kumpulan komponen UI yang siap pakai seperti grid system, form, button, navbar, modal, dan masih banyak lagi, serta gaya CSS yang telah ditentukan sebelumnya. Keunggulan Bootstrap antara lain:

Responsif: Bootstrap dirancang untuk menjadi responsif, artinya tampilan yang dihasilkan akan menyesuaikan dengan ukuran layar perangkat pengguna, baik itu desktop, tablet, atau smartphone. Hal ini memudahkan pengembang web dalam membangun aplikasi web yang bisa diakses dengan baik di berbagai perangkat.

Mudah digunakan: Bootstrap menyediakan dokumentasi yang lengkap dan mudah dipahami, serta contoh-contoh kode yang siap pakai. Pengembang web dapat dengan mudah menggunakan komponen-komponen Bootstrap untuk membangun tampilan yang menarik dan responsif.

Customizable: Meskipun Bootstrap menyediakan gaya CSS yang sudah ditentukan sebelumnya, namun pengembang web masih dapat mengkustomisasi tampilan sesuai kebutuhan proyek. Bootstrap menggunakan konsep class dan komponen yang modular, sehingga memudahkan pengembang web dalam mengganti tampilan yang sudah ada atau menambahkan gaya baru.

Kompatibilitas: Bootstrap kompatibel dengan berbagai peramban web modern, seperti Google Chrome, Mozilla Firefox, Microsoft Edge, dan Safari. Hal ini memastikan bahwa tampilan yang dibangun dengan Bootstrap dapat diakses oleh pengguna dengan berbagai perangkat dan peramban web.

## Materi 2: Review Web UI Testing with Serenity

### Poin Pertama
Poin pertama menjelaskan tentang Pengertian Serenity BDD, Terdiri dari Apa Saja Arsitektur Serenity BDD, Deskripsi dari Masing-masing Arsitektur Serenity BDD (Define Requirements, Automate Acceptance Criteria, Implement the Test, Report on the Test Results).

- Serenity BDD adalah sebuah framework pengujian perangkat lunak yang berbasis pada Behavior-Driven Development (BDD). BDD adalah metodologi pengembangan perangkat lunak yang fokus pada kolaborasi antara tim pengembang, tim pengujian, dan pemangku kepentingan bisnis untuk menghasilkan perangkat lunak yang berkualitas dan sesuai dengan kebutuhan bisnis.

- Arsitektur Serenity BDD terdiri dari beberapa tahap, yaitu:

Define Requirements: Tahap ini melibatkan kolaborasi antara tim pengembang, tim pengujian, dan pemangku kepentingan bisnis untuk menentukan kebutuhan bisnis yang harus diimplementasikan dalam perangkat lunak. Hasil dari tahap ini adalah sebuah dokumen yang berisi skenario pengujian yang dijelaskan dalam bahasa alami yang dapat dimengerti oleh semua pihak terkait.

Automate Acceptance Criteria: Tahap ini melibatkan tim pengujian dalam mengubah skenario pengujian yang sudah didefinisikan dalam tahap sebelumnya menjadi skenario pengujian yang dapat dijalankan secara otomatis. Serenity BDD menyediakan fitur yang memungkinkan pengujian dapat ditulis dalam bahasa alami yang mudah dipahami, seperti Gherkin.

Implement the Test: Tahap ini melibatkan tim pengembang dalam mengimplementasikan kode pengujian berdasarkan skenario pengujian yang sudah diotomatisasi dalam tahap sebelumnya. Serenity BDD mendukung pengujian dalam berbagai bahasa pemrograman, seperti Java, C#, dan Ruby.

Report on the Test Results: Tahap ini melibatkan tim pengujian dalam melihat hasil dari pengujian yang sudah dijalankan dan menghasilkan laporan yang dapat memberikan informasi tentang status pengujian dan kualitas perangkat lunak yang diuji. Serenity BDD menyediakan fitur pelaporan yang komprehensif dan dapat digunakan untuk menghasilkan laporan yang informatif dan mudah dipahami.

### Poin Kedua
Poin kedua menjelaskan tentang Persiapan dan Tools untuk Melakukan Testing dengan Serenity BDD dan Maven, Penjelasan tentang Practice Scenario dengan Serenity BDD (Write Test Story, Create Test Class, Create Test Steps, Create Page Object, Run the Test).
  
- Sebelum dapat melakukan pengujian menggunakan Serenity BDD, beberapa persiapan dan pengaturan perlu dilakukan, antara lain:

Menggunakan Maven: Maven adalah sebuah alat manajemen proyek yang banyak digunakan dalam pengembangan perangkat lunak Java. Serenity BDD dapat diintegrasikan dengan Maven untuk mengelola dependensi dan konfigurasi proyek pengujian.

Menggunakan Serenity BDD Plugin: Serenity BDD menyediakan plugin untuk Maven yang dapat digunakan untuk mengatur pengaturan dan konfigurasi proyek pengujian.

Menyusun Skenario Pengujian: Skenario pengujian dalam Serenity BDD ditulis dalam bahasa Gherkin, yang merupakan bahasa alami yang mudah dipahami oleh tim pengembang, tim pengujian, dan pemangku kepentingan bisnis. Skenario pengujian biasanya dinyatakan dalam bentuk "cerita" (story) yang berisi langkah-langkah pengujian yang diinginkan.

- Praktik pengujian dengan Serenity BDD biasanya melibatkan langkah-langkah sebagai berikut:

Menulis Test Story: Tim pengujian menulis skenario pengujian dalam bentuk cerita (story) menggunakan bahasa Gherkin. Cerita ini harus jelas, spesifik, dan mudah dimengerti oleh semua pihak terkait, termasuk tim pengembang dan pemangku kepentingan bisnis.

Membuat Test Class: Setelah cerita pengujian ditulis, tim pengujian membuat kelas pengujian (test class) yang akan mengimplementasikan skenario pengujian tersebut. Kelas pengujian ini akan mengandung kode pengujian yang akan dijalankan secara otomatis.

Membuat Test Steps: Dalam kelas pengujian, tim pengujian membuat langkah-langkah pengujian (test steps) yang sesuai dengan langkah-langkah dalam cerita pengujian. Langkah-langkah pengujian ini akan dijalankan secara berurutan sesuai dengan skenario pengujian yang ditentukan dalam cerita pengujian.

Membuat Page Object: Page Object adalah sebuah pola desain yang digunakan dalam Serenity BDD untuk memisahkan logika pengujian dari implementasi antarmuka pengguna. Tim pengujian membuat Page Object yang berisi metode-metode untuk mengakses dan memanipulasi elemen-elemen antarmuka pengguna dalam pengujian. Hal ini memungkinkan pengujian tetap berjalan walaupun ada perubahan pada antarmuka pengguna.

Menjalankan Pengujian: Setelah semua langkah pengujian, langkah-langkah pengujian, dan Page Object sudah dibuat, tim pengujian dapat menjalankan pengujian menggunakan alat pengujian yang disediakan oleh Serenity BDD, seperti JUnit atau TestNG. Serenity BDD akan menjalankan pengujian sesuai dengan skenario pengujian yang telah ditentukan dalam cerita pengujian, dan menghasilkan laporan hasil pengujian yang bisa dianalisis oleh tim pengujian dan tim pengembang.

### Poin Ketiga
Poin ketiga menjelaskan tentang Serenity Properties, Parameter Injection, Meta Filtering, Parameterized Scenario. 
  
Serenity BDD menyediakan fitur-fitur lanjutan yang dapat membantu tim pengujian dalam mengatur dan mengelola pengujian dengan lebih efisien, antara lain:

- Serenity Properties: Serenity Properties adalah file konfigurasi yang dapat digunakan untuk mengatur berbagai pengaturan dalam pengujian, seperti URL aplikasi yang diuji, pengaturan untuk pengujian paralel, dan pengaturan untuk pelaporan. Dengan menggunakan Serenity Properties, tim pengujian dapat mengelola pengaturan pengujian secara terpusat dan menghindari hardcoding pengaturan dalam kode pengujian.

- Parameter Injection: Serenity BDD mendukung injeksi parameter ke dalam langkah-langkah pengujian. Parameter-parameter ini dapat digunakan untuk mengganti nilai-nilai dalam langkah-langkah pengujian dengan nilai yang diberikan dalam cerita pengujian atau dalam pengaturan Serenity Properties. Hal ini memungkinkan tim pengujian untuk menguji berbagai skenario dengan data yang berbeda tanpa harus mengubah kode pengujian secara langsung.

- Meta Filtering: Meta Filtering adalah fitur Serenity BDD yang memungkinkan tim pengujian untuk mengatur pengujian yang akan dijalankan berdasarkan tag atau meta-data yang diberikan dalam cerita pengujian. Tag ini dapat digunakan untuk mengatur pengujian berdasarkan fitur, cerita, atau kriteria lain yang diperlukan. Meta Filtering memungkinkan tim pengujian untuk menjalankan pengujian tertentu atau kelompok pengujian yang spesifik berdasarkan tag yang diberikan, sehingga memungkinkan pengujian yang lebih selektif dan efisien.

- Parameterized Scenario: Serenity BDD juga mendukung pengujian skenario yang di-parameterisasi. Dalam skenario yang di-parameterisasi, tim pengujian dapat menentukan data uji yang akan digunakan dalam skenario pengujian dalam bentuk tabel atau data lainnya. Dengan pengujian skenario yang di-parameterisasi, tim pengujian dapat menguji berbagai kasus uji dengan data yang berbeda dalam satu skenario pengujian, sehingga mengurangi repetisi kode pengujian dan memungkinkan pengujian yang lebih dinamis.
