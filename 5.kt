//5. Дано натуральное число. Определить сколько раз в нем встречаются цифры 0 и 5 (суммарно).

fun main() {
    print("Введите натуральное число: ")
    var n: Int = readLine()!!.toInt()
    var nr: Int = n
    var amount: Int = 0
    while (n != 0) {
        if ((n % 10 == 5) || (n % 10 == 0)) {
            amount += 1
        }
        n /= 10
    }
    println("В числе " + nr + " всего " + amount + " цифр 5 и 0")
}