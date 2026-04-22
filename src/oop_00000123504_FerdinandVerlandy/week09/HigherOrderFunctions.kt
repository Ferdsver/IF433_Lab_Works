package oop_00000123504_FerdinandVerlandy.week09

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    println("Original Data: $numbers")

    val result = numbers
        .filter { it % 2 == 0 }
        .map { it * 10 }
        .sortedByDescending { it }

    result.forEach {
        println("Final Value: $it")
    }
}