package oop_00000123504_FerdinandVerlandy.week05

fun main() {

    val pegawaiList: List<Pegawai> = listOf(
        Dosen("Budi"),
        Admin("Siti")
    )

    for (pegawai in pegawaiList) {
        pegawai.bekerja()

        if (pegawai is Dosen) {
            pegawai.mengajar()
        }
    }

    val mathHelper = MathHelper()

    println(mathHelper.hitungLuas(4))
    println(mathHelper.hitungLuas(5,3))
    println(mathHelper.hitungLuas(7.0))
}