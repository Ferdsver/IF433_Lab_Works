package oop_00000123504_FerdinandVerlandy.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)