package kotlinLan

fun main() {
    val round = readLine()!!.toInt()
    var count = 0

    for (i in 1..round){
        val (m, c) = readLine()!!.split(" ").map { it.toInt() }
        if (m>c) count++ else if (m<c) count--
    }
    when{
         count > 0 -> println("Mishka")
        count < 0 -> println("Chris")
        else -> println("Friendship is magic!^^")
    }
}