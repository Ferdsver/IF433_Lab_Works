package oop_00000123504_FerdinandVerlandy.week01

fun main() {
    val score = 85
    val name: String? = null

    val status = calculateStatus(score)
    val safeName = name ?: "Nama tidak diketahui"

    println("$safeName $status")
}

fun calculateStatus(score: Int) =
    when {
        score >= 80 -> "Lulus"
        else -> "Tidak Lulus"
    }
