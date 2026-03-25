package oop_00000123504_FerdinandVerlandy.week07

fun main() {
    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    DatabaseManager.connect()

    val original = DataUser("Ferdinand", 20)
    val updated = original.copy(age = 25)

    println(original)
    println(updated)

    val (name, age) = original
    println("Name: $name, Age: $age")

    val response: ApiResponse = ApiResponse.Success("OK")

    val message = when (response) {
        is ApiResponse.Success -> response.data
        is ApiResponse.Error -> response.message
    }
}
