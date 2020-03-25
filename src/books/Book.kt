package books

class Book (val title : String, val author : String, val year : Int, var pages : Int) {

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

fun Book.weight() : Double {
    return pages*1.5
}

fun Book.tornPages(tornPages : Int) {
    this.pages -= tornPages
}

object Constants {

    const val BASE_URL = "http://www.sommerengineering.com/"
}

class Puppy {

    fun playWithBook(book : Book) {
        book.pages -= (Math.random() * book.pages).toInt()
    }

}
