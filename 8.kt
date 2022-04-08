//8. Известна масса каждого предмета, загружаемого в автомобиль. Определить общую массу груза.

fun main(){
    var n:Int = 1
    var weight: Double=0.0
    var buff:String = ""
    while (true) {
        print("Введите вес загружаемого предмета номер ${n}, (если больше нет, введите S) ")
        buff= readLine().toString()
        if ((buff=="s") or (buff=="S")){
            n--
            break
        }
        else {
            weight += buff.toDouble()
            n++
        }
    }
    println("Общая масса груза равна ${weight}\nВсего ${n} предмет(-а/-ов)")
}