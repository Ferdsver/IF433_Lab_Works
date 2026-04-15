package oop_00000123504_FerdinandVerlandy.week08

class set_krs(val nim:String, val tahun:Int){
    fun pilih_matkul(kodeMatkul:String){
        println("Matkul dipilih $kodeMatkul")
    }
}

fun main() {
    var nama:String? ="Ferds";
    nama = null;
    println("Hai $nama")

    val setKRS = set_krs(nim="00000123504", tahun = 2024)
    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun}")
    setKRS.pilih_matkul("OOP");
}