package oop_00000123504_FerdinandVerlandy.week03

class Employee(val name: String, val nim: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun updateRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Rating harus antara 1 sampai 5")
        }
    }

    val bonus: Int
        get() = salary * performanceRating / 10
}