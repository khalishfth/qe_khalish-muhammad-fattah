# (8) RESTful API Introduction & Testing

## Materi 1: Pengenalan RESTful API

### Poin Pertama
Poin pertama menjelaskan tentang Pengertian API dan REST API. API (Application Programming Interface) adalah kumpulan aturan, protokol, dan alat yang memungkinkan program atau aplikasi untuk berinteraksi dengan sistem atau aplikasi lain. API sering digunakan untuk mengintegrasikan atau menghubungkan aplikasi yang berbeda agar dapat saling berinteraksi. REST API (Representational State Transfer API) adalah jenis API yang mengikuti arsitektur REST, yaitu suatu model arsitektur yang didesain untuk membangun aplikasi web berbasis data. REST API bekerja dengan menggunakan HTTP protocol dan metode HTTP verbs seperti GET, POST, PUT, DELETE, dan OPTIONS untuk mengakses, memanipulasi, dan mengirim data ke server.

### Poin Kedua
Poin kedua menjelaskan tentang API Workflow. API Workflow adalah serangkaian proses atau langkah-langkah yang terjadi saat sebuah aplikasi menggunakan API untuk berkomunikasi dengan sistem atau aplikasi lain. API Workflow biasanya terdiri dari beberapa tahapan mulai dari inisiasi koneksi hingga pengolahan data dan pengiriman respons kembali ke aplikasi. Contoh penggunaan API Workflow adalah pada aplikasi web yang memperoleh data dari API pihak ketiga. Aplikasi akan mengirimkan permintaan ke API dengan memberikan kunci API yang valid dan meminta data spesifik yang diperlukan. Setelah API menerima permintaan dan memverifikasi kunci API, server akan memproses permintaan dan mengirimkan respons yang berisi data yang diminta dalam format yang telah ditentukan. Aplikasi kemudian akan mengolah data tersebut dan menampilkan informasi pada halaman web.

### Poin Ketiga
Poin ketiga menjelaskan tentang Komponen REST API, JSON dan HTTP Response Code. 
- Komponen utama REST API adalah:

1. URL (Uniform Resource Locator): alamat atau endpoint untuk mengakses sumber daya (resource) pada server
2. HTTP methods: GET, POST, PUT, DELETE, dan OPTIONS yang digunakan untuk mengakses dan memanipulasi sumber daya
3. HTTP headers: informasi tambahan yang dikirim bersama request atau response
4. Response: data yang dikirimkan oleh server sebagai balasan atas request yang dikirimkan

JSON (JavaScript Object Notation) adalah format data yang digunakan untuk mentransmisikan dan menyimpan data. JSON memiliki struktur data yang mirip dengan objek JavaScript, dan sering digunakan dalam REST API untuk mengirim data dari server ke client.

HTTP response code adalah kode status yang diberikan oleh server sebagai respons atas request yang dikirimkan. 
- Beberapa contoh kode status HTTP response adalah:

1. 200 OK: permintaan berhasil dan respons mengandung informasi yang diminta
2. 201 Created: permintaan berhasil dan server telah membuat sebuah sumber daya baru
3. 204 No Content: permintaan berhasil tetapi server tidak mengembalikan konten apapun, biasanya digunakan pada permintaan PUT atau DELETE
4. 400 Bad Request: permintaan gagal karena klien mengirimkan data yang tidak valid atau tidak lengkap
5. 401 Unauthorized: permintaan gagal karena klien tidak memiliki otorisasi untuk mengakses sumber daya yang diminta
6. 403 Forbidden: permintaan gagal karena server tidak mengizinkan klien untuk mengakses sumber daya yang diminta
7. 404 Not Found: permintaan gagal karena server tidak dapat menemukan sumber daya yang diminta
8. 500 Internal Server Error: permintaan gagal karena terjadi kesalahan pada server

## Materi 2: REST API Testing

### Poin Pertama
Poin pertama menjelaskan tentang tentang API Testing, Macam-macam API Testing dan Tools API Testing. API testing adalah proses pengujian perangkat lunak yang bertujuan untuk memastikan bahwa API bekerja sesuai dengan yang diharapkan. API testing meliputi pengujian fungsional dan non-fungsional seperti pengujian validasi input dan output, pengujian performa, pengujian keamanan, dan sebagainya.

- Beberapa macam API testing yang umum dilakukan antara lain:

1. Unit testing: menguji fungsi-fungsi API secara terisolasi
2. Integration testing: menguji integrasi API dengan aplikasi atau sistem lain
3. Functional testing: menguji fungsi-fungsi API secara keseluruhan
4. Performance testing: menguji kinerja API dalam mengolah data dalam jumlah besar
5. Security testing: menguji keamanan API dari serangan seperti injection, XSS, CSRF, dll.

- Beberapa tools API testing yang umum digunakan antara lain:

1. Postman: aplikasi desktop untuk melakukan pengujian API secara visual dan mudah
2. SoapUI: aplikasi desktop untuk melakukan pengujian API SOAP dan REST
3. JMeter: aplikasi desktop untuk melakukan pengujian performa dan beban pada API

### Poin Kedua
Poin kedua menjelaskan tentang Test Case pada API Testing, Tipe-tipe output dari API dan Tipe-tipe bug pada API Testing. Test case pada API testing berisi langkah-langkah yang harus dilakukan untuk menguji API dan mengevaluasi hasilnya. Test case pada API testing biasanya mencakup parameter masukan (input) yang dikirim ke API, serta hasil keluaran (output) yang diharapkan dari API.

- Tipe-tipe output dari API antara lain:

1. JSON: format data yang paling umum digunakan pada REST API
2. XML: format data alternatif yang juga digunakan pada beberapa REST API dan SOAP API
3. File: beberapa API dapat menghasilkan file dalam format tertentu seperti PDF atau CSV

- Tipe-tipe bug pada API testing antara lain:

1. Error handling: API tidak memberikan respons yang tepat saat terjadi kesalahan atau kondisi tidak valid
2. Performance: API tidak mampu menangani beban atau data dalam jumlah besar
3. Security: API tidak memiliki atau kurangnya mekanisme keamanan yang memadai seperti autentikasi atau enkripsi data
4. Integration: API tidak dapat berintegrasi dengan aplikasi atau sistem lain dengan benar atau tidak sesuai dengan spesifikasi yang telah ditetapkan

### Poin Ketiga
Poin ketiga menjelaskan tentang keuntungan dan tantangan melakukan API Testing. 
- Keuntungan dari melakukan API testing antara lain:

1. Meningkatkan kualitas API: API testing dapat membantu menemukan bug atau kesalahan pada API sehingga dapat diperbaiki dan diuji kembali untuk memastikan kualitasnya
2. Meningkatkan efisiensi pengembangan: dengan melakukan API testing secara teratur, pengembang dapat mengidentifikasi bug dan kesalahan lebih awal sehingga dapat segera diperbaiki sebelum masuk ke tahap produksi
3. Meningkatkan keamanan: API testing dapat membantu menemukan kelemahan keamanan pada API sehingga dapat diperbaiki sebelum digunakan secara luas dan menimbulkan masalah keamanan

- Tantangan dari melakukan API testing antara lain:

1. Membutuhkan pemahaman yang mendalam tentang API dan teknologi terkait
2. Pengujian API seringkali tidak bisa dilakukan secara terisolasi, sehingga memerlukan integrasi dengan sistem atau aplikasi lain
3. Pengujian API harus memperhatikan aspek keamanan, karena API dapat digunakan oleh pihak yang tidak diinginkan untuk melakukan serangan atau akses tidak sah pada sistem atau aplikasi yang terkait dengan API.

