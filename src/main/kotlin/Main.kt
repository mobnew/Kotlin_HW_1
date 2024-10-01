package ru.netology

import kotlin.math.max

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Task 1
    val payment = 5000
    println("Коммисия за перевод " + payment + " руб. составляет " + paymetFee(payment) + " руб.")

    //Task 2
    val likes = 1011
    println(likesCount(likes))

    //Task 3
    val sum = 1100
    println("Сумма покупки со скидкой " + musicDiscount(sum,false))
}

private fun paymetFee(payment: Int): Int {
    return max((payment * 0.0075).toInt(), 35)
}

private fun likesCount(likes: Int): String {
    if ((likes % 10 == 1) && (likes.toString().takeLast(2) != "11")) {
        return "Пронравилось " + likes + " человеку."
    } else {
        return "Пронравилось " + likes + " людям."
    }
}

private fun musicDiscount(sum: Int, premium: Boolean): Int {
    var sumWithDiscount: Int = sum
    val staticDiscount = 100

    if ((sum > 1000) && (sum <= 10_000)) {
        sumWithDiscount = sum - staticDiscount
    } else if (sum > 10_000) {
        sumWithDiscount = (sum * 0.95).toInt()
    }

    if (premium) {
        sumWithDiscount = (sumWithDiscount * 0.99).toInt()
    }

    return sumWithDiscount
}