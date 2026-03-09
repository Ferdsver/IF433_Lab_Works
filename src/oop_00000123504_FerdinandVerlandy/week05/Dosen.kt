package oop_00000123504_FerdinandVerlandy.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar")
    }

    fun mengajar() {
        println("$nama memberikan materi ke mahasiswa")
    }
}