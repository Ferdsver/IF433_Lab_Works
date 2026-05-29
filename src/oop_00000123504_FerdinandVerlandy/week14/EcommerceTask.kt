package oop_00000123504_FerdinandVerlandy.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}


interface OrderRepository {

    fun saveOrder(data: String)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(data: String) {

        File("safe_orders.csv")
            .appendText("$data\n")
    }
}


interface NotificationService {

    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("EMAIL => $message")
    }
}


interface PricingStrategy {

    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}


class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        strategy: PricingStrategy
    ) {

        val finalPrice = strategy.calculate(basePrice)

        println("Processing order: $itemName -> $finalPrice")

        repo.saveOrder("$itemName,$finalPrice")

        notifier.sendNotification(
            "Pesanan $itemName berhasil diproses!"
        )
    }
}


fun main() {

    val repository = CsvOrderRepository()

    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repository,
        notifier
    )

    processor.processOrder(
        itemName = "Mechanical Keyboard",
        basePrice = 1500000.0,
        strategy = VipPricing()
    )

    processor.processOrder(
        itemName = "Gaming Mouse",
        basePrice = 500000.0,
        strategy = RegularPricing()
    )
}