package oop_00000123504_FerdinandVerlandy.week03

fun main() {

    println("=== EMPLOYEE TEST ===")

    val emp = Employee("Ferdinand", "00000123504")

    emp.salary = 5000
    emp.updateRating(4)

    println("Bonus: ${emp.bonus}")
}