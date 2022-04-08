//4. Дано натуральное число. Определить количество цифр в нем.

fun main() {
    println("Введите натуральное число")
    var a: Int = readLine()!!.toInt()
    var a_r: Int = a
    var n: Int = 0
    while (a != 0) {
        n += 1
        a = a.div(10)
    }
    println("Количество цифр в числе " + a_r + " равно " + n)
}