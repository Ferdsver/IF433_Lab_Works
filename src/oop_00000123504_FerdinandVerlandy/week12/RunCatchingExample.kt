package oop_00000123504_FerdinandVerlandy.week12

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}