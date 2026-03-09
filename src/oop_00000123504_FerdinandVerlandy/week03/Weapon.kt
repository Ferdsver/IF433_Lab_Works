package oop_00000123504_FerdinandVerlandy.week03

class Weapon(val name: String, damageInput: Int) {

    var damage: Int = damageInput
        set(value) {

            if (value < 0) {
                println("Damage tidak boleh negatif!")
            }
            else if (value > 1000) {
                println("Damage terlalu besar! Diset menjadi 1000.")
                field = 1000
            }
            else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}