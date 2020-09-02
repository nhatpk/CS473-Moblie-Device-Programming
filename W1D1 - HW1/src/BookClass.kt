open class Book() {
    var title: String = ""
        get() = field
        set(value) {
            field = value
        }

    var author: String = ""
        get() = field
        set(value) {
            field = value
        }

    var price: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor (title: String, author: String, price: Double): this() {
        this.title = title
        this.author = author
        this.price = price
    }

    open fun read() {
        println("Reading paper book.")
        println("Book Title: ${this.title}")
        println("Book Author: ${this.author}")
        println("Book Price: ${this.price}")
        println("------------------------------------")
    }
}

class Ebook(title: String, author: String, price: Double): Book(title, author, price) {
    override fun read() {
        println("Reading from electronic device.")
        println("Book Title: ${this.title}")
        println("Book Author: ${this.author}")
        println("Book Price: ${this.price}")
        println("------------------------------------")
    }
}