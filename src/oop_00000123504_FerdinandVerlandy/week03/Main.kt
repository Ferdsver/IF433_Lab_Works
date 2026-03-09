package oop_00000123504_FerdinandVerlandy.week03

fun main() {

    println("=== EMPLOYEE TEST ===")

    val emp = Employee("Ferdinand", "00000123504")

    emp.salary = 5000
    emp.updateRating(4)

    println("Bonus: ${emp.bonus}")



    println("\n=== WEAPON TEST ===")

    val sword = Weapon("Dragon Slayer", 100)

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")

    println("Tier senjata: ${sword.tier}")
}