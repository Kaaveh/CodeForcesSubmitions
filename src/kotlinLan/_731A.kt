package kotlinLan

import kotlin.math.abs
import kotlin.math.min

fun main() {
    val str = readLine()!!
    var sum = 0
    var curr = 'a'
    for (ch in str) {
        sum += min(abs(ch - curr), abs(abs(ch - curr) - 26) % 26)
        curr = ch
    }
    println(sum)
}