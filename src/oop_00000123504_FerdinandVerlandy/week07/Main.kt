package oop_00000123504_FerdinandVerlandy.week07

fun main() {
    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    DatabaseManager.connect()

    val user1 = User("Ferdinand", 20)
    val user2 = User("Ferdinand", 20)

    println(user1)
    println(user1 == user2)
}
