import kotlin.math.sqrt

//12. Рассчитать площадь треугольника по заданным с клавиатуры координатам трех его вершин.

fun geron_form(a: Double, b: Double, c: Double): Double {
    var p: Double = (a + b + c) / 2
    return Math.sqrt(p * (p - a) * (p - b) * (p - c))
}

fun findSpacing(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))
}

fun main() {
    var A = emptyArray<Double>()
    var B = emptyArray<Double>()
    var C = emptyArray<Double>()
    print("Введите x координату точки A\t")
    A += readLine()!!.toDouble()
    print("Введите y координату точки A\t")
    A += readLine()!!.toDouble()
    print("Введите x координату точки B\t")
    B += readLine()!!.toDouble()
    print("Введите y координату точки B\t")
    B += readLine()!!.toDouble()
    print("Введите x координату точки C\t")
    C += readLine()!!.toDouble()
    print("Введите y координату точки C\t")
    C += readLine()!!.toDouble()
    var a: Double = findSpacing(A[0], A[1], B[0], B[1])
    var b: Double = findSpacing(C[0], C[1], B[0], B[1])
    var c: Double = findSpacing(A[0], A[1], C[0], C[1])
    var s: Double = Math.round(geron_form(a, b, c) * 10000.0).toDouble() / 10000
    println("Площадь треугольника равна $s")
}