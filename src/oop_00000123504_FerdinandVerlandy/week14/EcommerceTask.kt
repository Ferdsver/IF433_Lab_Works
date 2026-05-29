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
            .printWriter()
            .use { writer ->
                writer.println(data)
            }
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

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)