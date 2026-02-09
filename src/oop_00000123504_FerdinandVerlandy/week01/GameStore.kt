package oop_00000123504_FerdinandVerlandy.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        (price * 80) / 100
    } else {
        (price * 90) / 100
    }
