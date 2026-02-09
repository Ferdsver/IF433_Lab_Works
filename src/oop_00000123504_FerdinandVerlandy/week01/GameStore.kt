package oop_00000123504_FerdinandVerlandy.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        (price * 80) / 100
    } else {
        (price * 90) / 100
    }

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan     : $note")
}
