package kotlinLan

fun main() {
    val count = readLine()!!.toInt()
    for (i in 1..count) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        println((b - a%b)%b)
    }
}