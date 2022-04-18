package fd4

fun main() {
    println("Pengecekan bilangan 7 atau tidak")

    println("Masukkan bilangan 1 : ")
    val bil1 = readLine()?.toIntOrNull() ?: 0

    // ini adalah contoh condisi if dengan 2 pengecekan
    if(bil1 == 7) {
        println("ini adalah bilangan 7")
    } else if(bil1 == 8) {
        println("ini adalah bilangan 8")
    } else {
        println("ini adalah bilangan 7")
    }

    val isSeven : Boolean = bil1 == 7

    // ini contoh if dengan 1 pengecekan dan variable penampung
    if(isSeven) {
        println("ini adalah bilangan 7")
    } else {
        println("ini bukan bilangan 7")
    }

    // contoh when
    when (bil1) {
        7 -> {
            println("ini adalah bilangan 7")
        }
        8 -> {
            println("ini adalah bilangan 8")
        }
        else -> {
            println("ini adalah bilangan 7")
        }
    }
}