//9. Одноклеточная амеба каждые три часа делится на две клетки. Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.

fun main() {
    var amount: Int = 1
    var time_start: Int = 3
    var time_end: Int = 24
    var time_step: Int = 3
    for (i in time_start..time_end step time_step) {
        amount *= 2
        println("Через $i часа(-ов) будет $amount амёб(-ы)")
    }
}