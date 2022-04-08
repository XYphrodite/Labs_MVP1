//15. С клавиатуры вводятся координаты двух точек: А(х1, у1) и В(х2, у2). Составить программу, определяющую, которая из точек находится ближе к началу координат.

/*fun findSpacing(a1: Double, a2: Double, b1: Double, b2: Double): Double {
    return Math.sqrt(Math.pow((b1 - a1), 2.0) + Math.pow((b2 - a2), 2.0))
}*/

fun main() {
    var A = emptyArray<Double>()
    var B = emptyArray<Double>()
    print("Введите x координату точки A\t")
    A += readLine()!!.toDouble()
    print("Введите y координату точки A\t")
    A += readLine()!!.toDouble()
    print("Введите x координату точки B\t")
    B += readLine()!!.toDouble()
    print("Введите y координату точки B\t")
    B += readLine()!!.toDouble()
    var a: Double = findSpacing(A[0], A[1], 0.0, 0.0)
    var b: Double = findSpacing(B[0], B[1], 0.0, 0.0)
    if (a > b) {
        println("Точка B находится ближе к началу координат")
    } else if (a == b) {
        println("Точки A и B находятся на одинаковом расстоянии к началу координат")
    } else {
        println("Точка A находится ближе к началу координат")
    }
}