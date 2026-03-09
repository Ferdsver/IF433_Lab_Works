package oop_00000123504_FerdinandVerlandy.week02

class Jagoan {
    val nama:String = "unknown";
    val hp:Int = 100;

    fun jalan() {
        //codingan utk jalan
        //x+ = 3
        //this bla bla bla bla
        println("Hero jalan kaki ke pasar");
    }

    fun serang() {
        println("Hero serang dengan life: $hp");
    }
}

fun main() {
    val hero = Jagoan();
    println("darah hero: ${hero.hp}");

    hero.jalan();
    hero.serang();

    println("Nama jagoannya adalah " + hero.nama);
}