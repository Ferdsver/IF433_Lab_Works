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
}