# (12) Fundamental Performance Test

### Poin Pertama
Pengertian Performance Test, Apa yang Diukur dari Performance Test, Mengapa Performance Test Jarang Dilakukan.

Performance Test adalah jenis pengujian perangkat lunak yang dilakukan untuk mengukur kemampuan suatu sistem atau aplikasi dalam menghadapi beban kerja yang tinggi atau kondisi lingkungan yang ekstrem. Tujuan utama dari Performance Test adalah untuk mengidentifikasi batasan atau kelemahan sistem dalam hal kinerja, kestabilan, dan skalabilitasnya.

Dalam Performance Test, beberapa parameter yang diukur antara lain adalah kecepatan respon sistem, waktu respons, throughput (jumlah transaksi yang dapat ditangani dalam satu waktu), penggunaan sumber daya (seperti CPU, memori, jaringan), dan kemampuan sistem dalam menjaga performa yang konsisten dalam jangka waktu yang lama. Hasil dari Performance Test memberikan informasi yang berharga mengenai bagaimana sistem atau aplikasi akan berperilaku di bawah beban kerja yang sebenarnya.

Namun, Performance Test jarang dilakukan secara rutin oleh banyak organisasi atau tim pengembangan perangkat lunak. Beberapa alasan mengapa Performance Test jarang dilakukan antara lain:

- Biaya: Melakukan Performance Test dapat membutuhkan sumber daya yang cukup besar, termasuk infrastruktur, peralatan, dan tenaga ahli yang spesialis dalam melakukan pengujian performa. Hal ini dapat menjadi kendala bagi beberapa organisasi yang memiliki anggaran terbatas.
- Waktu: Proses Performance Test dapat memakan waktu yang cukup lama tergantung pada kompleksitas sistem atau aplikasi yang diuji. Hal ini dapat mengganggu jadwal pengembangan atau perilisan produk.
- Kurangnya kesadaran: Beberapa organisasi atau tim pengembangan perangkat lunak mungkin tidak sepenuhnya menyadari pentingnya Performance Test atau mungkin mengabaikan pentingnya pengujian performa dalam siklus pengembangan perangkat lunak mereka.

### Poin Kedua
Poin kedua menjelaskan tentang Apa yang Perlu Diperhatikan dari Performance Test, Contoh Kasus Performance Test, Beberapa Jenis Performance Tests. 

Dalam melakukan Performance Test, ada beberapa hal yang perlu diperhatikan, antara lain:

- Tujuan yang jelas: Performance Test harus memiliki tujuan yang jelas dan spesifik, seperti mengukur waktu respons sistem dalam menghadapi beban kerja tertentu atau mengidentifikasi batasan sistem dalam hal jumlah pengguna bersamaan yang dapat ditangani. Hal ini akan membantu dalam merancang skenario pengujian yang relevan dan mendapatkan hasil yang akurat.
- Skenario pengujian yang realistis: Skenario pengujian harus didesain untuk mencerminkan situasi nyata penggunaan sistem atau aplikasi, termasuk beban kerja, jumlah pengguna, dan pola penggunaan. Skenario pengujian yang realistis akan memberikan hasil pengujian yang lebih akurat dan berguna dalam mengidentifikasi potensi masalah.
- Monitoring dan analisis: Selama pengujian, sistem atau aplikasi yang diuji harus dimonitor secara cermat untuk mengumpulkan data kinerja yang relevan. Data ini kemudian dianalisis untuk mengidentifikasi kinerja sistem atau aplikasi, seperti waktu respons, throughput, penggunaan sumber daya, dan lain-lain. Analisis data akan membantu dalam mengidentifikasi masalah kinerja dan memberikan wawasan yang berguna untuk perbaikan.

Contoh kasus Performance Test dapat melibatkan pengujian aplikasi web e-commerce yang harus menghadapi beban kerja puncak selama periode liburan, di mana jumlah pengguna dan transaksi meningkat secara signifikan. Dalam pengujian ini, Performance Test dapat mengukur kecepatan respon sistem, throughput, penggunaan sumber daya, dan kemampuan sistem dalam menghadapi beban kerja yang tinggi.

Beberapa jenis Performance Tests yang umum digunakan dalam pengujian perangkat lunak antara lain:

- Smoke Testing: Jenis pengujian awal yang bertujuan untuk memverifikasi apakah sistem atau aplikasi dapat berfungsi dengan baik dalam kondisi normal dan memenuhi persyaratan dasar kinerja sebelum dilakukan pengujian lebih lanjut.

- Load Testing: Pengujian yang menguji kinerja sistem atau aplikasi di bawah beban kerja yang meningkat secara bertahap untuk mengukur batasan sistem dalam menghadapi jumlah pengguna atau transaksi yang tinggi.

- Stress Testing: Pengujian yang menguji kinerja sistem atau aplikasi di bawah tekanan atau beban kerja yang ekstrem untuk mengidentifikasi batasan sistem dan mengukur kemampuan sistem dalam menghadapi situasi darurat atau beban kerja yang tidak biasa.

- Spike Testing: Pengujian yang menguji kinerja sistem atau aplikasi ketika terjadi lonjakan beban kerja yang signifikan dalam waktu singkat, seperti dalam situasi promosi atau penjualan online yang sibuk.

- Soak Testing: Pengujian yang menguji kinerja sistem atau aplikasi dalam jangka waktu yang lama untuk mengidentifikasi masalah yang mungkin muncul dalam pemakaian jangka panjang, seperti kebocoran memori atau penggunaan sumber daya yang berlebihan.

### Poin Ketiga
Poin ketiga menjelaskan tentang Metode Performance Test dan Pengertian dari beberapa istilah penting dalam Performance Tests.

Dalam melakukan Performance Test, beberapa metode dan langkah yang perlu diperhatikan antara lain:

Membuat Test Plan: Merencanakan pengujian performa dengan membuat Test Plan yang terperinci, termasuk tujuan pengujian, skenario pengujian, metrik kinerja yang akan diukur, infrastruktur yang akan digunakan, dan tim yang bertanggung jawab.

Menentukan Metode Test: Memilih metode pengujian yang sesuai sesuai dengan tujuan pengujian dan kebutuhan proyek. Misalnya, jika tujuan pengujian adalah untuk mengukur batasan sistem dalam menghadapi beban kerja yang tinggi, maka Load Testing atau Stress Testing mungkin lebih relevan. Pemilihan metode pengujian harus didasarkan pada kebutuhan proyek dan karakteristik sistem yang diuji.

Selain itu, ada beberapa istilah penting dalam Performance Tests yang perlu dipahami, antara lain:

- System Under Test (SUT): Merujuk pada sistem atau aplikasi yang sedang diuji kinerjanya. SUT adalah objek pengujian dalam Performance Test, dan pengujian dilakukan terhadap sistem atau aplikasi ini untuk mengukur kinerjanya.

- Load Generator: Merupakan komponen dalam infrastruktur pengujian yang bertugas untuk menghasilkan beban kerja atau penggunaan sumber daya yang tinggi pada sistem atau aplikasi yang diuji. Load Generator bisa berupa alat perangkat keras atau perangkat lunak yang menghasilkan aktivitas yang mewakili pengguna nyata pada sistem atau aplikasi yang diuji.

- Throughput: Merupakan ukuran untuk mengevaluasi jumlah data atau transaksi yang berhasil diproses oleh sistem atau aplikasi dalam satuan waktu tertentu. Throughput digunakan untuk mengukur efisiensi sistem dalam menghadapi beban kerja yang tinggi.

- Performance Threshold: Merupakan batasan kinerja yang telah ditentukan sebelumnya sebagai standar yang harus dipenuhi oleh sistem atau aplikasi yang diuji. Performance Threshold biasanya dinyatakan dalam angka atau persentase tertentu, dan pengujian dilakukan untuk memastikan bahwa kinerja sistem atau aplikasi masih berada di dalam batasan ini.

- Saturation: Merupakan kondisi ketika sistem atau aplikasi telah mencapai batasan maksimal kinerjanya dan tidak mampu lagi menghadapi peningkatan beban kerja. Pengujian dilakukan untuk mengidentifikasi titik jenuh atau saturation point dari sistem atau aplikasi yang diuji.

- Virtual Users: Merupakan entitas yang dibuat dalam pengujian untuk merepresentasikan pengguna nyata pada sistem atau aplikasi yang diuji. Virtual Users digunakan untuk menghasilkan beban kerja yang mewakili aktivitas pengguna sebenarnya pada sistem atau aplikasi yang diuji.

- Response Time: Merupakan waktu yang diperlukan oleh sistem atau aplikasi untuk merespons permintaan dari pengguna, misalnya waktu yang diperlukan untuk memuat halaman web atau memproses transaksi. Response Time digunakan untuk mengukur kecepatan respon sistem atau aplikasi dan menjadi salah satu indikator kinerja yang penting dalam Performance Test.

Dalam melakukan Performance Test, pemahaman yang baik tentang istilah-istilah tersebut akan membantu dalam merencanakan pengujian, menginterpretasi hasil pengujian, dan mengidentifikasi masalah kinerja yang mungkin terjadi pada sistem atau aplikasi yang diuji.

