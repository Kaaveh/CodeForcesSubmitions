package kotlinLan

import kotlin.math.pow

fun main() {
    val count = readLine()!!.toInt()
    var input: Int

    for (i in 1..count) {
        input = readLine()!!.toInt()
        var k = 1
        val setOfNumbers = mutableSetOf<Int>()

        while (input != 0) {
            if (input % 10 != 0) {
                setOfNumbers.add((input % 10) * k)
            }
            input /= 10
            k *= 10
        }
        println(setOfNumbers.size)
        println(setOfNumbers.joinToString(" "))
    }
}