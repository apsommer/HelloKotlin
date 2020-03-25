package spices

import books.BookInfo

fun main(args : Array<String>) {

    val book = BookInfo("apples", "bananas", 1983)
    println()
    println("Basic info: " + book.basicInfo())
    println("All info: " + book.allInfo())
    val title = book.title
    println("Just the title: $title")
}
