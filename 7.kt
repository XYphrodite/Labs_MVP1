//Вычислить сумму   при х = 2.

fun foo(x: Double): Double {
    var a: Double = 1.0
    var sum: Double = 0.0
    while (a != 12.0) {
        sum += Math.pow(x, a)
        a += 1
    }
    return sum
}

fun main(){
    var x: Double=2.0
    var result: Double=foo(x)
    println("Результат равен ${result}")
}