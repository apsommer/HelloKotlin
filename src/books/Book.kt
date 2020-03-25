package books

class Book (val title : String, val author : String, val year : Int) {

    companion object {
        const val max = 100
    }

    fun canBorrow(n : Int) : Boolean {
        return (n <= 100)
    }

    fun printUrl() {
        val constants = Constants
        val url = constants.BASE_URL + title + ".html"
        println(url)
    }

}

object Constants {

    const val BASE_URL = "http://www.sommerengineering.com/"
}
