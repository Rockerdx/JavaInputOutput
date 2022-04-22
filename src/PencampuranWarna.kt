fun main() {

    println("Program mencampur 2 buat warna")

    // ambil input warna1 dalam bentuk string
    println("Masukkan warna pertama")
    val warna1 = readLine().toString()

    // ambil input warna2 dalam bentuk string
    println("Masukkan warna kedua")
    val warna2 = readLine().toString()

    // saya akan berangkat jika hari ini tidak hujan atau ada mobil
    // saya akan berangkat jika hari ini tidak hujan dan ada mobil

    val merah = "Merah"
    val biru = "Biru"
    val hijau = "Hijau"

    val isCampuranHijau = warna1 == merah && warna2 == biru || warna1 == biru && warna2 == merah
    val isCampuranCoklat = warna1 == "Merah" && warna2 == "Hijau" || warna1 == "Hijau" && warna2 == "Merah"
    val isCampuranCyan = warna1 == "Biru" && warna2 == "Hijau" || warna1 == "Hijau" && warna2 == "Biru"


    if(warna1 == merah && warna2 == biru || warna1 == biru && warna2 == merah) {
        println("Warna hasil pencampuran = $hijau")
    } else if(isCampuranCoklat) {
        println("Warna hasil pencampuran = Coklat")
    } else if(isCampuranCyan) {
        println("Warna hasil pencampuran = Cyan")
    }

    // implementasi pakai when credit mas juna
    val result = when("$warna1-$warna2"){
        "merah-biru","biru-merah" -> "hijau"
        "merah-hijau", "hijau-merah"-> "coklat"
        "biru-hijau", "hijau-biru"-> "cyan"
        else -> "DRAW"

    // cara lain untuk perbandingan string dengan mengabaikan besar kecil
    //(warna1.equals("Merah", ignoreCase = true))
}

//buat program menentukan hasil pencampuran 2 warna, dengan kriteria
//
//input user : Merah, Biru, Hijau
//
//output
// Merah + Biru = Hijau
// Merah + Hijau = Coklat
// Biru + Hijau = Cyan
//


//buat program menentukan panggilan
//
//input user : Pria, Wanita, angka
//
//
//output
// Pria dan umur di bawah 15 tahun -> adik laki laki
// Wanita dan umur di bawah 15 tahun -> adik perempuan
// Pria dan umur di atas 40 tahun tapi di bawah 60 -> om
// Wanita dan umur di atas 40 tahun tapi di bawah 60-> tante
// Pria dan umur di atas 60 tahun -> kakek
// Wanita dan umur di atas 60 tahun -> nenek
//

