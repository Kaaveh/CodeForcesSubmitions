package kotlinLan

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var colored = false
    for (i in 0 until n) {
        colored = readLine()!!.toCharArray().any { it == 'C' || it == 'M' || it == 'Y' }
        if (colored)
            break
    }

    println("#" + if (colored) "Color" else "Black&White")
}