//13. С клавиатуры вводится пять чисел. Подсчитать количество положительных среди этих чисел.

fun main() {
    var n: Int = 0
    var arr = emptyArray<Double>()
    while (n != 5) {
        print("Введите число номер ${n + 1}\t")
        arr += readLine()!!.toDouble()
        n++
    }
    var amount: Int = 0
    while (n != 0) {
        n--
        if (arr[n] > 0) {
            amount++
        }
    }
    println("Количество положительных среди этих чисел $amount")
}