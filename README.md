# Automation-Katalon-Source-Demo
Automation Katalon Sauce Demo (V2.0) - Modular E2E Testing
Tujuan Proyek
Proyek ini adalah framework otomatisasi pengujian Web yang dikembangkan menggunakan Katalon Studio dan Groovy. Fokus utama proyek ini adalah menguji alur penting dari situs e-commerce SauceDemo, dengan penekanan pada modularitas kode melalui implementasi Custom Keywords.
Proyek ini mencakup pengujian end-to-end (E2E) untuk alur utama dan telah di-refactor secara ekstensif menggunakan Custom Keywords untuk meningkatkan reusability dan maintenance.

Modularitas Penuh: Implementasi Custom Keywords yang terpisah untuk setiap tahap utama pengujian, memastikan kode mudah dibaca dan dirawat.

Login Keywords: Mengelola proses open browser dan otentikasi pengguna.

Verification Keywords: Menguji visibilitas elemen di halaman Produk.

Checkout Keywords: Mengelompokkan seluruh alur pembelian (Add to Cart, mengisi formulir checkout, hingga konfirmasi pesanan).

Pengujian Positif & Negatif: Mencakup skenario Login yang berhasil dan alur Checkout penuh yang sukses, serta pengujian alternatif (misalnya, proses login yang gagal).

Best Practices: Penggunaan Test Object yang terpusat di Object Repository dan parameterisasi data (penggunaan variabel username/password) untuk fleksibilitas pengujian.

Cara Menjalankan Proyek Secara Lokal
1. Clone Repository
2. Buka di Katalon Studio: Buka aplikasi Katalon Studio, lalu pilih File > Open Project dan arahkan ke folder lokal Anda.
3. Update WebDriver: Pastikan WebDriver Anda (Chrome/Edge) diperbarui via menu Tools > Update WebDrivers untuk menghindari error sesi.
4. Eksekusi: Jalankan Test Case dari Test Suite yang tersedia di Test Explorer.
