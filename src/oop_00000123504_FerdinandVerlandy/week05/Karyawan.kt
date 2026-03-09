package oop_00000123504_FerdinandVerlandy.week05

abstract class Karyawan {
    val nama: String = "Budi";

    abstract fun bekerja(kecepatan: Int = 3):String

    fun terima_gaji() {
        println("Terima GAJI!");
    }
}

class Staff:Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return println("Staff ngetik, kecepatan: $kecepatan").toString()
    }
}

class Manager:Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return println("Manager mengawasi kecepatan: $kecepatan km/jam").toString()
    }
}

fun main() {
    val staf = Staff();
    staf.bekerja(7);

    val mgr = Manager();
    mgr.bekerja(12);
}