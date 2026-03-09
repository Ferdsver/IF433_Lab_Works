package oop_00000123504_FerdinandVerlandy.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengurus administrasi")
    }
}