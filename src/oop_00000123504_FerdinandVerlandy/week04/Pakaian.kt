package oop_00000123504_FerdinandVerlandy.week04

open class Pakaian{
    private var merk:String = "";
    protected var harga:Int = 0;

    init{
        this.merk = "Uniqlo"
        println("Merk nya adalah $merk")
    }

    public fun jumlah_penjualan(){
        println("Pakaian terjual");
    }
}