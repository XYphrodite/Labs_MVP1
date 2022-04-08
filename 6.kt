//6. Дано натуральное число. Найти число, получаемое при прочтении его цифр справа налево.

fun main() {
    print("Введите натуральное число: ")
    var n: Int = readLine()!!.toInt()
    var nr: Int = n
    var length: Int = 0
    var amount: Int = 0
    var new: Int = 0
    while (n != 0) {
        length += 1
        n = n.div(10)
    }
    n = nr
    while (n != 0) {
        length -= 1
        new += n % 10 * Math.pow(10.0, length.toDouble()).toInt()
        n /= 10
    }
    println("При прочетнии числа ${nr} справа налево получается ${new}")
}