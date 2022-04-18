package fd4

fun main() {

    // contoh penggunaan for loop increment/bertambah
    for(i in 1..10) {
        val perkalianI = i * 2
        println("nilai i : $perkalianI")
    }

    // contoh penggunaan for loop decrement/berkurang
    for(angka in 10 downTo 1) {
        val perkalianI = angka * 2
        println("nilai i : $perkalianI")
    }

    // contoh penggunaan for loop increment dengan step 2
    for(i in 1..10 step 2) {
        val perkalianI = i * 2
        println("nilai i : $perkalianI")
    }

    // contoh di array

    val arrayNama = arrayOf("Febry","Ryan", "Ega", "Boni", "Juna")
    // array ke 0 = "Febry"
    // array ke 3 = "Boni"
    // array ke 4 = "Juna"

    // perulangan di array dengan for loop biasa
    for(index in 0 .. arrayNama.size-1) {
        println("nama = ${arrayNama[index]}")
    }

    // perulangan di array dengan for each
    for(nama in arrayNama) {
        println("namaEach = $nama")
    }


}
















