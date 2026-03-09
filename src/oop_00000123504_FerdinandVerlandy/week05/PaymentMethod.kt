package oop_00000123504_FerdinandVerlandy.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}