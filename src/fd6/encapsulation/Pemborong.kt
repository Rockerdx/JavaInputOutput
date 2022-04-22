package fd6.encapsulation

class Pemborong(var name: String) {


    fun manageAlbum(album: Album, name: String, artist: String, price: Double, numberOfCopies: Int) {
        /*
       Defining states and behaviors for album
       */
        album.name = name
        album.artist = artist
        album.updatePrice(price)
        album.updateNoOfCopies(numberOfCopies)

        /*
       Printing album details
        */println("Album managed by :" + this.name)
        println("Album details::::::::::")
        println("Album name : " + album.name)
        println("Album artist : " + album.artist)
        println("Album price : " + album.getPrice())
        println("Album number of copies : " + album.getNumberOfCopies())
    }
}