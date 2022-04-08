//1. Известны площади круга и квадрата. Определить, уместится ли круг в квадрате?

fun main() {
    println("Введите площадь круга")
    var s_rd: Double = readLine()!!.toDouble()
    println("Введите площадь квадрата")
    var s_sd: Double = readLine()!!.toDouble()
    var r: Double = Math.sqrt(s_rd / Math.PI)
    var a: Double = Math.sqrt(s_sd)
    if (a / 2 >= r)
        println("Круг умещается в квадрат")
    else
        println("Круг не умещается в квадрат")
}