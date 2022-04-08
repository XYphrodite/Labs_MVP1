//14. Написать программу проверяющую, является ли правильной дробь а/в. Числа а и в вводятся с клавиатуры.

fun main() {
    print("Введите число a\t")
    var a: Double = readLine()!!.toDouble()
    print("Введите число b\t")
    var b: Double = readLine()!!.toDouble()
    if (b == 0.0) {
        println("Дробь НЕ правильная")
        return
    }
    if (a < b) {
        println("Дробь правильная")
    } else {
        println("Дробь НЕ правильная")
    }
}