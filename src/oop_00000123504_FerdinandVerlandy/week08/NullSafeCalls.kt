package oop_00000123504_FerdinandVerlandy.week08

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama:String, val addr: Alamat?)

fun main(){
    val alm = Alamat("47", "Tanggerang")
    val mhs = Mahasiswa("Ferds", alm)

    println("Hai ${mhs.nama} kamu tinggal di ${mhs.addr?.kota}");

    val defKota =mhs.addr?.let{
            alamatDefault->"tinggal di ${mhs.addr.kota}"
    }?:"Tidak tau tinggal dimana"
    println("hai ${mhs.nama} kamu tinggal di ${defKota}")
}