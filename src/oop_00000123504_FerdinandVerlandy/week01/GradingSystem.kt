package oop_00000123504_FerdinandVerlandy.week01

fun main() {
    val score = 85
    val name = "Budi"

    val status = when {
        score >= 80 -> "Lulus"
        else -> "Tidak Lulus"
    }

    println("$name $status")
}
