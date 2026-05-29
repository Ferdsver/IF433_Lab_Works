package oop_00000123504_FerdinandVerlandy.week14

interface Database {

    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {

    override fun query(sql: String): List<String> {
        return listOf("pg_data1", "pg_data2")
    }
}