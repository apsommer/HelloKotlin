package spices

import books.BookInfo

fun main(args : Array<String>) {

    val book = BookInfo("apples", "bananas", 1983)
    println()
    println("Basic info: " + book.basicInfo())
    println("All info: " + book.allInfo())
    val title = book.title
    println("Just the title: $title")

    var allBooks = setOf("Mistborn", "Hero of Ages", "Well of Ascension")
    var library = mapOf("Sanderson" to allBooks)

    println("Does library include Mistborn? " + library.any {it.value.contains("Mistborn")})
    println("Does library include Hamlet? " + library.any {it.value.contains("Hamlet")})

    var moreBooks = mutableMapOf("J.R.R. Tolkien" to "Lord of the Rings")
    moreBooks.getOrPut("Bilbo Baggins") {"The Shire"}

    println("library: $library")
    println("moreBooks: $moreBooks")
}
