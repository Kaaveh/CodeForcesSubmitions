package kotlinLan

fun main(){
    readLine()!!
    val array = readLine()!!.split(" ").map { it.toInt() }
    println(array.sorted().joinToString(separator = " "))
}