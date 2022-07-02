package kotlinLan

fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }
    var result = 0
    var max = array[0]
    var min = array[0]
    array.drop(0)

    array.forEach { element ->
        if (element > max) {
            max = element
            result++
        } else if (element < min) {
            min = element
            result++
        }
    }

    println(result)
}