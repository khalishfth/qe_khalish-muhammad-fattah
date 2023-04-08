# (9) Web Programming & Testing

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

Pengertian CSS Grouping dan Implementasinya:

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
Poin ketiga menjelaskan tentang Pengertian dan Kegunaan Frontend Framework, Contoh-contoh Frontend Framework, Pengertian Bootstrap dan Keunggulannya

- Pengertian dan Kegunaan Frontend Framework:

Frontend Framework adalah kumpulan dari berbagai teknologi atau komponen yang digunakan untuk membangun antarmuka pengguna (UI) suatu aplikasi web. Frontend Framework menyediakan struktur, komponen, dan gaya yang sudah siap pakai sehingga memudahkan pengembang web dalam membangun tampilan yang menarik dan responsif tanpa harus membuat semuanya dari awal.

- Contoh-contoh Frontend Framework:

Bootstrap: Bootstrap adalah salah satu Frontend Framework yang paling populer dan banyak digunakan. Bootstrap menyediakan kumpulan komponen UI seperti grid system, form, button, navbar, dan masih banyak lagi, serta gaya CSS yang sudah siap pakai. Bootstrap juga menyediakan JavaScript plugin untuk memperkaya interaksi pengguna dalam aplikasi web.

- Pengertian Bootstrap dan Keunggulannya:

Bootstrap adalah sebuah Frontend Framework yang dikembangkan oleh Twitter. Bootstrap menyediakan kumpulan komponen UI yang siap pakai seperti grid system, form, button, navbar, modal, dan masih banyak lagi, serta gaya CSS yang telah ditentukan sebelumnya. Keunggulan Bootstrap antara lain:

Responsif: Bootstrap dirancang untuk menjadi responsif, artinya tampilan yang dihasilkan akan menyesuaikan dengan ukuran layar perangkat pengguna, baik itu desktop, tablet, atau smartphone. Hal ini memudahkan pengembang web dalam membangun aplikasi web yang bisa diakses dengan baik di berbagai perangkat.

Mudah digunakan: Bootstrap menyediakan dokumentasi yang lengkap dan mudah dipahami, serta contoh-contoh kode yang siap pakai. Pengembang web dapat dengan mudah menggunakan komponen-komponen Bootstrap untuk membangun tampilan yang menarik dan responsif.

Customizable: Meskipun Bootstrap menyediakan gaya CSS yang sudah ditentukan sebelumnya, namun pengembang web masih dapat mengkustomisasi tampilan sesuai kebutuhan proyek. Bootstrap menggunakan konsep class dan komponen yang modular, sehingga memudahkan pengembang web dalam mengganti tampilan yang sudah ada atau menambahkan gaya baru.

Kompatibilitas: Bootstrap kompatibel dengan berbagai peramban web modern, seperti Google Chrome, Mozilla Firefox, Microsoft Edge, dan Safari. Hal ini memastikan bahwa tampilan yang dibangun dengan Bootstrap dapat diakses oleh pengguna dengan berbagai perangkat dan peramban web.

## Materi 2: Review Web UI Testing with Serenity

### Poin Pertama
Poin pertama menjelaskan tentang 

### Poin Kedua
Poin kedua menjelaskan tentang 

### Poin Ketiga
Poin ketiga menjelaskan tentang 
