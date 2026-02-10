package oop_00000123504_FerdinandVerlandy.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {
    init {
        if (nim.length != 10) {
            println("WARNING: NIM tidak valid!")
        }

        if (name.isBlank()) {
            println("WARNING: Nama kosong!")
        }
    }
}
