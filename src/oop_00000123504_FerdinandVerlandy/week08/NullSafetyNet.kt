package oop_00000123504_FerdinandVerlandy.week08

fun main() {
    var nama:String? = "Ferds";

    try {
        println("nama kamu ${nama!!.uppercase()}");
    } catch(ex: Exception) {
        println("kamu kena error, ini pesan err-nya: ${ex.message}");
    }

    val kumpulanData: List<Any> = listOf("Budi", 2024, "Tanggerang")
    for(item in kumpulanData){
        val isiData = item as? String
        if(isiData != null){
            println(isiData)
        }
    }
    }


