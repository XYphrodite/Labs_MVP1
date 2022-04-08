//22. Для заданного числа n, введенного с клавиатуры, вывести все его делители и их количество на экран.

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
    print("Делители:\t")
    for (i in d) {
        print("${i}, ")
    }
    print("\nИх количество:\t${amount}")
}