package oop_00000123504_FerdinandVerlandy.week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}