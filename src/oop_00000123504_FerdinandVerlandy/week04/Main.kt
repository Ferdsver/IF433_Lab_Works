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

}