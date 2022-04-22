package fd5

fun main() {

    val murid1 = Anak("Rizki", 18)
    murid1.variableAnak = "kata dalam huruf kecil"

    println("variableAnak : ${murid1.variableAnak}")


}

abstract class Bapak() {
    var variableAnak = ""
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }

    abstract fun ngantukan()
}

class Anak(var nama: String = "Farid", val umur: Int = 24) : Bapak() {

    init {
        nama = nama.toUpperCase()

        println("Nama : $nama, Umur $umur")

        variableAnak
    }

    override fun ngantukan() {

    }


}