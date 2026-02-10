package oop_00000123504_FerdinandVerlandy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    if (nim.length != 10 || name.isBlank()) {
        println("Data tidak valid, objek tidak dibuat.")
        return
    }

    println("Pilih jalur pendaftaran:")
    println("1. Sudah memilih jurusan")
    println("2. Belum memilih jurusan")
    print("Pilihan: ")
    val choice = scanner.nextInt()
    scanner.nextLine() // buang newline

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("Mahasiswa ${student.name} berhasil terdaftar.")
    println("Jurusan: ${student.major}")
    println("IPK: ${student.gpa}")
}
