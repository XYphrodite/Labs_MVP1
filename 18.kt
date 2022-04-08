//18. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
// Если введены некорректные данные, то сообщить об этом. Предполагаем, что в феврале 29 дней.

fun main() {
    var date = emptyArray<Int>()
    print("Введите число:\t")
    date += readLine()!!.toInt()
    print("Введите месяц:\t")
    date += readLine()!!.toInt()
    var thirty_one = arrayOf(1, 3, 5, 7, 8, 10, 12)
    var thirty = arrayOf(4, 6, 9, 11)
    var twenty_nine = arrayOf(2)
    if (thirty_one.contains(date[1])) {
        if ((date[0] > 0) && (date[0] <= 31)) {
            print("Данные корректны")
        } else {
            print("Данные НЕкорректны")
        }
    } else if (thirty.contains(date[1])) {
        if ((date[0] > 0) && (date[0] <= 30)) {
            print("Данные корректны")
        } else {
            print("Данные НЕкорректны")
        }
    } else if (twenty_nine.contains(date[1])) {
        if ((date[0] > 0) && (date[0] <= 29)) {
            print("Данные корректны")
        } else {
            print("Данные НЕкорректны")
        }
    } else {
        print("Данные НЕкорректны")
    }
}