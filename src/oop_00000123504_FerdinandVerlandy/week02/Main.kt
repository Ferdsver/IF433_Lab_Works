package oop_00000123504_FerdinandVerlandy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    if (nim.length != 10 || name.isBlank()) {
        println("Data tidak valid, objek tidak dibuat.")
    } else {
        val student = Student(nim, name, major)
        println("Mahasiswa ${student.name} berhasil dibuat.")
    }
}
