package oop_00000123504_FerdinandVerlandy.week06

fun processCheckout(payment: PaymentMethod, amount: Double) {
    payment.pay(amount)
}

fun main() {

    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay, 50000.0)
    processCheckout(creditCard, 150000.0)

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}