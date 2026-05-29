package oop_00000123504_FerdinandVerlandy.week14

interface Shape {

    fun area(): Int
}

class SafeRectangle(
    private val width: Int,
    private val height: Int
) : Shape {

    override fun area(): Int {
        return width * height
    }
}

class SafeSquare(
    private val side: Int
) : Shape {

    override fun area(): Int {
        return side * side
    }
}