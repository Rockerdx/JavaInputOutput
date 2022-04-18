package fd4

fun main() {
    println("Penjumlahan 2 bilangan")

    print("Masukkan bilangan 1 : ")
    val bil1 = readLine()?.toIntOrNull() ?: 0
    if(bil1 < 0) {
        print("Bilangan 1 harus positif")
        return
    }

    print("Masukkan bilangan 2 : ")
    val bil2 = readLine()?.toIntOrNull() ?: 0
    if(bil2 < 0) {
        print("Bilangan 2 harus positif")
        return
    }

    println("Hasil penjumlahan $bil1 dan $bil2 adalah = ${bil1 + bil2}")

}