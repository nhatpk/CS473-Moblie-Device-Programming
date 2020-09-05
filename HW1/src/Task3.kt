import java.lang.NullPointerException

// Author: Nhat Pham
// ID: 986847
// CS473
// Homework 1

fun main() {
    // Task 3a: Create a function to print the last digit and first digit of the given number
    task3a()

    // Task 3b: Write a function to find the sum of odd squared values in the given array of
    //integers
    task3b()

    // Task 3c: Write a Program using when expression to find the weight of a person in various
    //planets according to the choice of user input. Assume inputs in pounds. Do the
    //Kotlin approach to avoid NullPointerException if the input is null.
    task3c(null, 3)
}

fun task3a() {
    val n = 100
    val str: String = n.toString()

    println("Given n = $n")
    println("Last digit of n: ${str[str.lastIndex]}")
    println("First digit of n: ${str[0]}")
    println("--------------------------------------")
}

fun task3b() {
    val array = listOf<Int>( 1,2,3,4,6,5 )
    var arrayOfOdds = arrayListOf<Int>()
    var arrayOfSquared = arrayListOf<Int>()

    var sum = 0
    for (n in array) {
        if (n % 2 != 0) {
            val temp = n*n
            sum += temp
            arrayOfOdds.add(n)
            arrayOfSquared.add(temp)
        }
    }

    println("List of Odd numbers in given array:")
    arrayOfOdds.forEach { print(it); print(" ") }
    println()

    println("Sum of squared odds:")
    var firstValue = true
    arrayOfSquared.forEach {
        if (firstValue) { firstValue = false }
        else { print(" + ") }
        print(it)
    }
    println(" = $sum")
    println("--------------------------------------")
}

fun task3c(input: Int?, choice: Int) {
    var relativeGravity = 0.0

    try {
        when (choice) {
            1 -> relativeGravity = 0.78 // Venus
            2 -> relativeGravity = 0.39 // Mars
            3 -> relativeGravity = 2.65 // Jupiter
            4 -> relativeGravity = 1.17 // Saturn
            5 -> relativeGravity = 1.05 // Uranus
            6 -> relativeGravity = 1.23 // Neptune
        }

        val weight = relativeGravity*input!!;
        println("Weight = $weight")
        println("--------------------------------------")
    }
    catch (e: NullPointerException) {
        println("Input cant not be null.")
    }
}