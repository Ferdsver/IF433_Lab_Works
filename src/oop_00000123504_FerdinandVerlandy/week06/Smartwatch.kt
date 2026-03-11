package oop_00000123504_FerdinandVerlandy.week06

class Smartwatch(brand: String) : Watch(brand), WifiEnabled, BluetoothEnabled {

    override fun showTime() {
        println("Showing digital time on $brand smartwatch")
    }

    override fun connectWifi() {
        println("$brand smartwatch connected to WiFi")
    }

    override fun connectBluetooth() {
        println("$brand smartwatch connected to Bluetooth")
    }
}