object Fungsi {

    val nama = "Rizki"

    @JvmStatic
    fun main(args: Array<String>) {

        // Tampilin menu makanan
        // Tampilin total harga
        // Tampilin ui sukses

        tampilkanMenuMakanan("bakso")
        tampilkanTotalHarga(jumlah = 3)
        tampilkanUiSukses("Selamat, pesanan sudah otw")

        constructArray()


    }

    fun tampilkanMenuMakanan(namaMakanan : String) {

        println("Tampilkan menu makanan $namaMakanan $nama" )
    }

    fun tampilkanTotalHarga(jumlah : Int, harga: Int = 15000) {

        val pesan = "Tampilkan total harga"

        println("$pesan ${jumlah* harga}")
    }

    fun tampilkanUiSukses(message: String) = println("Tampilkan ui sukses, $message")

    fun constructArray() {

        val arrayCampur = arrayOf<Any>(1,"android", true, 2.0)
        val listCampur = arrayListOf(1,2,3,4,5)

        listCampur.add(2)
        listCampur.add(2)
        listCampur.add(2)
        listCampur.add(2)

        val array = Array(4,{ i -> i + 2 })
        // 0 + 2
        // 1 + 2
        // 2 + 2
        // 3 + 2

        array[0] = 13
        array[2] = 13

        array.forEach {
            print(it)
        }

    }
}