package oop_00000123504_FerdinandVerlandy.week07

fun main() {
    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    DatabaseManager.connect()
}