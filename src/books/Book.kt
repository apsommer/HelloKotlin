package books

open class Book (title : String, author : String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage ++
    }
}

class eBook (title : String, author : String, format : String = "text") : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}

class BookInfo (val title : String, val author : String, val year : Int) {

    fun basicInfo () : Pair<String, String> {
        return title to author
    }

    fun allInfo () : Triple<String, String, Int> {
        return Triple(author, title, year)
    }
}
