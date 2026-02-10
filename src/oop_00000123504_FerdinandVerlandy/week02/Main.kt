package oop_00000123504_FerdinandVerlandy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // === STUDENT ===
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
    scanner.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("Mahasiswa ${student.name} berhasil terdaftar.")
    println("IPK: ${student.gpa}")

    // === LOAN SYSTEM ===
    println("\n=== SISTEM PEMINJAMAN BUKU ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}
