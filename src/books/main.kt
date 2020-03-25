package books

fun main(args : Array<String>) {

    val book = Book("apples", "bananas", 1983)

    var allBooks = setOf("Mistborn", "Hero of Ages", "Well of Ascension")
    var library = mapOf("Sanderson" to allBooks)

    println("Does library include Mistborn? " + library.any {it.value.contains("Mistborn")})
    println("Does library include Hamlet? " + library.any {it.value.contains("Hamlet")})

    var moreBooks = mutableMapOf("J.R.R. Tolkien" to "Lord of the Rings")
    moreBooks.getOrPut("Bilbo Baggins") {"The Shire"}

    println("library: $library")
    println("moreBooks: $moreBooks")

    book.printUrl()
}
