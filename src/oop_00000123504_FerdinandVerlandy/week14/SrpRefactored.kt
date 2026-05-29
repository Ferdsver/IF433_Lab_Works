package oop_00000123504_FerdinandVerlandy.week14

class UserValidator {

    fun validate(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {

    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}