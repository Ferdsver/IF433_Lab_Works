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
}