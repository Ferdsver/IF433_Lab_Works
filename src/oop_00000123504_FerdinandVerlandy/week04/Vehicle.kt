package oop_00000123504_FerdinandVerlandy.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    open fun accelerate() {
        println("$brand mulai berakselerasi.")
    }
}