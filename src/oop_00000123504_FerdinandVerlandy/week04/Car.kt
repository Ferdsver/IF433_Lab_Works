package oop_<nim>_<nama>.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Tiiin tiiin!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand berakselerasi lebih cepat dengan $numberOfDoors pintu.")
    }

    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}