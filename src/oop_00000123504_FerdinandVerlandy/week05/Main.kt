package oop_00000123504_FerdinandVerlandy.week05

fun main() {

    // Polymorphic Collection Pegawai
    val pegawaiList: List<Pegawai> = listOf(
        Dosen("Budi"),
        Admin("Siti")
    )

    for (pegawai in pegawaiList) {
        pegawai.bekerja()

        if (pegawai is Dosen) {
            pegawai.mengajar()
        }
    }

    println("")

    // Task 1 - MathHelper Overloading
    val mathHelper = MathHelper()

    println("Luas Persegi: " + mathHelper.hitungLuas(4))
    println("Luas Persegi Panjang: " + mathHelper.hitungLuas(5, 3))
    println("Luas Lingkaran: " + mathHelper.hitungLuas(7.0))

    println("")

    // Task 2 - Payment Polymorphism
    val ewallet = EWallet("Ferdinand", 50000.0)
    val creditCard = CreditCard("Ferdinand", 100000.0)

    val payments: List<PaymentMethod> = listOf(
        ewallet,
        creditCard
    )

    for (p in payments) {
        p.processPayment(75000.0)
    }
}