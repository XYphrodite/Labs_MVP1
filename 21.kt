//21. Написать программу, подсчитывающую значение N-го числа Фибоначчи. Значение N вводится с клавиатуры.

fun Fibonachi(num: Int): Int {
    if (num == 0) {
        return 0
    }
    if ((num == 1) || (num == 2)) {
        return 1
    }
    var p: Int = 1
    var a: Int = 1
    var n: Int = 1
    var num_: Int = num
    while (num_ != 2) {
        p = a
        a = n
        n = p + a
        num_--
    }
    return n
}

fun main() {
    print("Введите номер числа Фибоначи:\t")
    var n: Int = readLine()!!.toInt()
    print(Fibonachi(n))
}