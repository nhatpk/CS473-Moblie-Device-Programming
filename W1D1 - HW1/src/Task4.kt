// Author: Nhat Pham
// ID: 986847
// CS473
// Homework 1

fun main() {
    val obj1 = Book()
    obj1.title = "Book 1"
    obj1.author = "default"
    obj1.price = 1.0
    obj1.read()

    var obj2 = Ebook("Book 2", "Au 2", 2.0)
    obj2.read()
}