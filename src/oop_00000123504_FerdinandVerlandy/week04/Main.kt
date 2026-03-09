package oop_00000123504_FerdinandVerlandy.week04

fun main() {

    // Test Car
    val car = Car("Toyota", 4)

    car.honk()
    car.accelerate()
    car.openTrunk()

    println()

    // Test ElectricCar
    val tesla = ElectricCar("Tesla", 4, 90)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println()

    // Test Employee Hierarchy
    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")

}