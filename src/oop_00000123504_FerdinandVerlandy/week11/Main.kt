package oop_00000123504_FerdinandVerlandy.week11

fun main() {

    println("=== TEST EXTENSION FUNCTIONS ===")

    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null

    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}