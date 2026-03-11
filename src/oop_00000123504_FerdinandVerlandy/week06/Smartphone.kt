package oop_00000123504_FerdinandVerlandy.week06

class Smartphone : Camera, Phone {

    override fun takePhoto() {
        super<Camera>.takePhoto()
        super<Phone>.takePhoto()
    }
}