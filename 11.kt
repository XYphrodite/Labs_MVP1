//11. Даны целые числа a1, a2, ..., a10. Выяснить, верно ли, что количество положительных чисел не превышает пяти.

fun main() {
    var n: Int = 0
    var arr = emptyArray<Int>()
    while (n != 10) {
        print("Введите целое число a${n + 1}\t")
        arr += readLine()!!.toInt()
        n++
    }
    n--
    var amount: Int = 0
    while (n != 0) {
        if (arr[n] > 0) {
            amount++
        }
        n--
    }
    if (amount >= 5) {
        println("Количество положительных чисел превышает пяти")
    } else {
        println("Количество положительных НЕ чисел превышает пяти")
    }
}