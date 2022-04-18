package fd4

fun main() {
    println("Pengecekan bilangan 7 atau tidak")

    println("Masukkan bilangan 1 : ")
    val bil1 = readLine()?.toIntOrNull() ?: 0


    if(bil1 == 7) {
        println("ini adalah bilangan 7")
    } else {
        println("ini bukan bilangan 7")
    }

    val isSeven : Boolean = bil1 == 7

    if(isSeven) {
        println("ini adalah bilangan 7")
    } else {
        println("ini bukan bilangan 7")
    }
}