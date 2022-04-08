//10. Дано натуральное число m и целые числа a1, a2, ..., am. Определить среднее арифметическое тех чисел ai, которые кратны числу n.

fun main() {
    print("Введите натуральное число m ")
    var m: Int = readLine()!!.toInt()
    print("Введите число n ")
    var n: Double = readLine()!!.toDouble()
    var amount: Int = 1
    var arr = emptyArray<Int>()
    var length: Int = 0
    var sum: Double = 0.0
    while (amount != m + 1) {
        print("Введите целое число a($amount) ")
        arr += readLine()!!.toInt()
        amount++
    }
    amount--
    while (amount != 0) {
        if (arr[amount - 1].toDouble().mod(n) == 0.0) {
            length++
            sum += arr[amount - 1]
        }
        amount--
    }
    var mid: Double = sum / length
    println("Cреднее арифметическое тех чисел ai, которые кратны числу $n равно $mid")
}