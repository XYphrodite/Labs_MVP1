//25. Написать программу, которая позволяет вычислить стоимость заправки автомобиля.
// Исходные данные  – тип топлива (бензин 92, 95, 98 или дизельное топливо) и количество литров вводятся с клавиатуры.

fun main() {
    val b: Map<String, Double>
    b = mapOf("АИ-92" to 48.30, "АИ-95" to 51.50, "АИ-98" to 57.91, "ДТ   " to 52.90)
    for (i in b) {
        println(i)
    }
    print("Введите порядковый номер топлива:\t")
    var n: Int = readLine()!!.toInt()
    var cost: Double = 0.0
    when (n) {
        1 -> cost = b["АИ-92"]!!
        2 -> cost = b["АИ-95"]!!
        3 -> cost = b["АИ-98"]!!
        4 -> cost = b["ДТ   "]!!
        else -> println("Не найдено")
    }
    if (cost == 0.0) {
        return
    }
    print("Введите количество литров:\t")
    var v: Double = readLine()!!.toDouble()
    var price: Double = v * cost
    print("Стоимость заправки составит ${price} рублей")
}