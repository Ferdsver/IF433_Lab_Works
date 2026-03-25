package oop_00000123504_FerdinandVerlandy.week07

fun main() {
    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    DatabaseManager.connect()

    val d1 = DataUser("Ferdinand", 20)
    val d2 = DataUser("Ferdinand", 20)

    println(d1)
    println(d1 == d2)
}
