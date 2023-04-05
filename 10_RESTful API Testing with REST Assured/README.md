# (10) RESTful API Testing with REST Assured

### Poin Pertama
Poin pertama menjelaskan tentang Konsep API, Fundamental API Integration, dan Fundamental API Test Process.

API (Application Programming Interface) adalah sekumpulan protokol, rutin, dan alat yang memungkinkan aplikasi untuk berkomunikasi dengan aplikasi lain. API menyediakan antarmuka yang diperlukan untuk mengintegrasikan dua atau lebih sistem dengan cara yang aman dan terstandarisasi. Ada dua jenis API yang umum digunakan: REST API dan SOAP API.

Fundamental API Integration adalah proses menghubungkan satu aplikasi dengan aplikasi lain melalui API. Ini melibatkan pemahaman tentang bagaimana API bekerja, protokol yang digunakan untuk berkomunikasi dengan API, dan bagaimana data dikirim dan diterima melalui API. Fundamental API Integration juga mencakup integrasi API dengan bahasa pemrograman tertentu, serta penggunaan alat untuk mengintegrasikan API dengan aplikasi Anda.

Fundamental API Test Process adalah proses pengujian API untuk memastikan bahwa API berfungsi dengan benar. Ini melibatkan pengujian setiap endpoint API dan memastikan bahwa data dikirim dan diterima dengan benar. Proses pengujian ini juga mencakup pengujian keamanan API dan pengujian kinerja API.

### Poin Kedua
Poin kedua menjelaskan tentang The Practical Test Pyramid, Step Overview BDD with Cucumber, Serenity BDD Reporting. 

The Practical Test Pyramid adalah pendekatan untuk menguji perangkat lunak yang berfokus pada pengujian unit, pengujian integrasi, dan pengujian GUI (Graphical User Interface). Pengujian unit menguji fungsi kode individual, pengujian integrasi menguji interaksi antara komponen, dan pengujian GUI menguji antarmuka pengguna. Pendekatan ini memastikan bahwa perangkat lunak diuji secara menyeluruh, tetapi efisien dan efektif.

Step Overview BDD dengan Cucumber adalah pendekatan pengujian yang melibatkan penggunaan bahasa alami untuk menggambarkan skenario pengujian. Cucumber menggunakan sintaks "Gherkin" yang mudah dipahami dan dapat dibaca oleh orang non-teknis untuk menggambarkan pengujian. Ini memungkinkan kolaborasi yang lebih baik antara pengembang, tester, dan pemangku kepentingan lainnya.

Serenity BDD Reporting adalah alat pelaporan pengujian yang dapat digunakan dengan BDD (Behavior Driven Development) dan pengujian otomatis. Serenity BDD Reporting menyediakan laporan pengujian yang terstruktur dengan baik dan mudah dipahami, termasuk informasi tentang skenario pengujian, hasil pengujian, dan screenshot dari pengujian.

### Poin Ketiga
Poin ketiga menjelaskan tentang Pengertian Rest Assured, Fitur-fitur Rest Assured, Tools untuk Rest Assured, Writing the Test with Rest Assured. 

Rest Assured adalah framework pengujian API yang ditulis dalam bahasa Java. Rest Assured menyediakan antarmuka yang mudah digunakan untuk menguji RESTful API dengan cara yang terstruktur dan mudah dipelajari. Rest Assured juga menyediakan alat untuk memvalidasi hasil pengujian dan menyediakan pelaporan yang mudah dibaca.

Fitur-fitur Rest Assured mencakup kemampuan untuk melakukan pengujian endpoint API, mengirim permintaan HTTP, memvalidkan hasil respons API, dan memeriksa status kode dan header respons. Rest Assured juga mendukung pengujian yang berbasis skenario, validasi JSON dan XML, serta pengujian autentikasi dan otorisasi.

Tools untuk Rest Assured termasuk IntelliJ IDEA, Eclipse, dan NetBeans, yang dapat digunakan untuk menulis kode pengujian Rest Assured. Ada juga plugin untuk Maven, Gradle, dan Ant yang dapat digunakan untuk mengintegrasikan Rest Assured ke dalam proyek Anda. Selain itu, Rest Assured dapat digunakan dengan alat-alat lain seperti JUnit, TestNG, dan Cucumber.

Writing the Test with Rest Assured melibatkan penggunaan metode dan objek dalam Rest Assured untuk mengirim permintaan API dan memeriksa hasil responsnya. Untuk memulai pengujian dengan Rest Assured, Anda perlu membuat objek "RequestSpecification" yang digunakan untuk mengkonfigurasi permintaan API. Setelah itu, Anda dapat mengirim permintaan API dengan menggunakan metode "get", "post", "put", atau "delete". Hasil respons kemudian dapat diperiksa menggunakan berbagai metode seperti "statusCode", "header", atau "body". Kemudian, hasil pengujian dapat divalidasi dengan menggunakan metode "assertThat" atau "expect".
