package fd4

fun main() {

    // contoh penggunaan for loop increment/bertambah
    for(i in 1..10) {
        val perkalianI = i * 2
        println("nilai i : $perkalianI")
    }

    // contoh penggunaan for loop decrement/berkurang
    for(i in 10 downTo 1) {
        val perkalianI = i * 2
        println("nilai i : $perkalianI")
    }

    // contoh penggunaan for loop increment dengan step 2
    for(i in 1..10 step 2) {
        val perkalianI = i * 2
        println("nilai i : $perkalianI")
    }

}