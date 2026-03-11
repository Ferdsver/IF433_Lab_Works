package oop_00000123504_FerdinandVerlandy.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("$name clicked!")
    }
}