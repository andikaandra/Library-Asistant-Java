<h1>Tugas 1
Membuat class diagram dari Library Asistant</h1>

berikut adalah bahan untuk penentuan nama kelas..

## Skenario dari SRS
Hari itu perpustakaan tempat Ahmad bekerja, kedatangan buku baru berjudul “Negeri Lima Menara”. Sekitar dua ratus pengunjung datang untuk meminjam buku baru tersebut. Kini, berkat Library Assistant, Ahmad tidak kesusahan lagi dalam melayani para pengunjung. Setiap pengunjung dilayani Ahmad dengan cepat. Mulai dari pengecekan member, Ahmad hanya perlu mengecek daftar member yang sudah tercatat di dalam aplikasi. Jika member tersebut tidak ditemukan, Ahmad hanya perlu menambahkan dan mencatata biodata penting yang harus Ahmad masukkan ke dalam aplikasi tersebut. Berikutnya, Ahmad akan mengecek ketersediaan buku yang ada, dan ketika buku yang ingin dipinjam oleh pengunjung Ahmad ada, maka selanjutnya Ahmad hanya perlu memasukkan ID dari calon peminjam buku dan ID buku yang akan dipinjam. Ketika muncul notifikasi sukses, yang terakhir Ahmad lakukan adalah mengambil buku yang diperlukan dan meminjamkannya kepada pelanggan. Kini, dengan pelayanan yang cepat, sudah tidak ada lagi kegaduhan pada saat antri buku-buku baru. Tidak seperti sebelumnya, Ahmad kini juga tidak perlu mengerjakan pekerjaan dua kali karena semua data sudah tersimpan pada aplikasi Library Assistant.

## UCS melihat daftar anggota
### Exceptions
n.a

## UCS melihat daftar buku
### Exceptions
n.a

## UCS memberi aksi peminjaman buku
### Exceptions
Jika Pustakawan mengisi data pada form Enter Book ID dengan data id buku yang sedang tidak dipinjam maka sistem tidak menampilkan informasi buku yang dipinjam.<br>
4a.1 Sistem menampilkan dialog box dengan pemberitahuan buku tidak berada di database transaksi.<br>
4a.2 Pustakawan melakukan klik tombol Okay, I’ll Check

## UCS menambah daftar anggota
### Exceptions
Menyimpan data anggota dengan ID yang sama seperti data anggota yang telah disimpan sebelumnya.<br>
3a.1 Sistem menampilkan dialog box yang berisi pesan eror bahwa terjadi  duplikasi primary key<br>
3a.2 Pustakawan melakukan klik tombol OK<br>
3a.3 Sistem menutup dialog box dan menampilkan dialog box lain yang berisi pesan bahwa data nggota tidak bisa ditambahkan<br>
3a.4 Pustakawan melakukan klik tombol OK <br>
3a.5 Sistem menutup dialog box<br>
3a.6 Pustakawan melakukan klik tombol close <br>
3a.7 Sistem menutup jendela Add New Member,<br>

## UCS menambah daftar buku
### Exceptions
Menyimpan data buku dengan ID yang sama seperti data buku yang telah tersimpan sebelumnya.<br>
3a.1 Sistem menampilkan dialog box yang berisi pesan eror bahwa terjadi duplikasi primary key<br>
3a.2 Pustakawan melakukan klik tombol OK<br>
3a.3 Sistem menutup dialog box dan menampilkan dialog box lain yang berisi pesan gagal menyimpan buku<br>
3a.4 Pustakawan melakukan klik tombol OK <br>
3a.5 Sistem menutup dialog box<br>
3a.6 Pustakawan melakukan klik tombol close.<br>
3a.7 Sistem menutup jendela Add New Book,<br>

## UCS mencatat transaksi peminjaman buku
### Exceptions
Jika Book ID dan Member ID salah, sistem gagal mencatat transaksi peminjaman baru. <br>
7a.1 Sistem menampilkan dialogue box yang menyatakan transaksi peminjaman gagal dicatat.  <br>
7a.2 Pustakawan menekan tombol Okay.<br>
7a.3 Sistem menutup dialogue box.<br>

Pustakawan tidak jadi mencatat transaksi peminjaman buku. <br>
8a.1 Sistem menampilkan dialogue box yang menyatakan transaksi peminjaman tidak jadi dilakukan.  <br>
8a.2 Pustakawan menekan tombol That’s Okay. <br>
8a.3 Sistem menutup dialogue box.<br>

## UCS menentukan aturan peminjaman buku
### Exceptions
n.a
