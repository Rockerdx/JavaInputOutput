object Contoh {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Penjumlahan 2 bilangan")

        print("Masukkan bilangan 1 : ")
        val bil1 = readLine()?.toIntOrNull() ?: 0
        print("Masukkan bilangan 2 : ")
        val bil2 = readLine()?.toIntOrNull()!!

        println("Hasil penjumlahan $bil1 dan $bil2 adalah = ${bil1 + bil2}")
    }
}