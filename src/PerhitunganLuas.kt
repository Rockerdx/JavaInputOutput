object PerhitunganLuas {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Perhitungan Luas Persegi Panjang")

        println("Masukkan Panjang Persegi : ")
        val panjang = readLine()?.toIntOrNull() ?: 0

        println("Masukkan Lebar Persegi : ")
        val lebar = readLine()?.toIntOrNull() ?: 0

        println("Luas Persegi Panjang adalah : ${panjang * lebar}")
    }
}