//23. Составить программу проверяющую, является ли введенное с клавиатуры число n простым.

fun main() {
    print("Введите число n:\t")
    var n: Int = readLine()!!.toInt()
    var d = emptyArray<Int>()
    var amount: Int = 0
    var k: Int = 1
    while (k != n + 1) {
        if (n.mod(k) == 0) {
            d += k
            amount++
        }
        k++
    }
    if ((n == 1) || (n == 0) || (amount == 2)) {
        print("Число простое")
    } else {
        print("Число НЕпростое")
    }
}