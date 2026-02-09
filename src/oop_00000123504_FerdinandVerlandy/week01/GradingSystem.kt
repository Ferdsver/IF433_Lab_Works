package oop_00000123504_FerdinandVerlandy.week01

fun main() {
    val score = 85
    val name = "Budi"

    val status = calculateStatus(score)
    println("$name $status")
}

fun calculateStatus(score: Int) =
    when {
        score >= 80 -> "Lulus"
        else -> "Tidak Lulus"
    }
