package oop_00000123504_FerdinandVerlandy.week02

class Student(
    val nim: String,
    val name: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 10) {
            println("WARNING: NIM tidak valid!")
        }
        if (name.isBlank()) {
            println("WARNING: Nama kosong!")
        }
    }

    constructor(
        nim: String,
        name: String
    ) : this(nim, name, "Non-Matriculated")
}
