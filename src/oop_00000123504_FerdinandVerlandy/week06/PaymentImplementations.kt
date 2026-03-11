package oop_00000123504_FerdinandVerlandy.week06

class Gopay : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paying $amount using GoPay")
    }
}

class CreditCard : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paying $amount using Credit Card")
    }
}