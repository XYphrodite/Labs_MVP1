//3. Дано целое число k (1 ≤ k ≤ 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января – понедельник.

fun main() {
    println("Введите целое число k (1 ≤ k ≤ 365)")
    var a: Int = readLine()!!.toInt()
    var n: Int = a.mod(7)
    when (n) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        0 -> println("Воскресенье")
        else -> {
            println("Некорректные данные")
        }
    }
}