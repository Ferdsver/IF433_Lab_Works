package oop_00000123504_FerdinandVerlandy.week06

interface Camera {

    fun takePhoto() {
        println("Taking photo...")
    }
}

interface Phone {

    fun call() {
        println("Calling someone...")
    }

    fun takePhoto() {
        println("Taking photo using phone camera...")
    }
}