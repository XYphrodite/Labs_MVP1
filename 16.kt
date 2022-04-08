import java.awt.event.KeyEvent
import java.awt.event.TextEvent
import java.awt.event.TextListener

//16. Кнопочный электронный кодовый замок имеет десять кнопок. Каждая из кнопок имеет свой порядковый номер от 0 до 9.
// Правильный код 1024 «зашит» внутрь замка. Человек, который хочет открыть дверь, должен ввести последовательно 1, 0, 2 и 4.
// Напишите программу, моделирующую работу такого замка.

fun main() {
    var n: Int = 0
    var buff: String
    while (n != 4) {
        print("Введите одну цифру: ")
        buff = readLine().toString()
        if ((n == 0) && (buff == "1")) {
            n++
        } else if ((n == 1) && (buff == "0")) {
            n++
        } else if ((n == 2) && (buff == "2")) {
            n++
        } else if ((n == 3) && (buff == "4")) {
            n++
        } else {
            n = 0
        }
    }
    println("Замок открыт")
}