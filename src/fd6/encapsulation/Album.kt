package fd6.encapsulation

class Album {
    var name: String = ""
    var artist: String = ""
    private var price = 0.0
    private var numberOfCopies = 0

    fun updatePrice(newPrice : Double) {
        price = if(newPrice > 0) {
            newPrice
        } else 0.0
    }

    fun updateNoOfCopies(newValue : Int) {
        numberOfCopies = if(newValue > 0) {
            newValue
        } else 0
    }

    fun getPrice() : Double = price

    fun getNumberOfCopies() : Int = numberOfCopies

    fun sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--
            println("One album has sold!")
        } else {
            println("No more albums available!")
        }
    }

    fun orderCopies(num: Int) {
        numberOfCopies += num
    }
}