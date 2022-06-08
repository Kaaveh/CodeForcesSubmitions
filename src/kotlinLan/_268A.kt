package kotlinLan

fun main(){

    val row = readLine()!!.toInt()
    val firstArray = mutableListOf<Int>()
    val secondArray = mutableListOf<Int>()
    var result = 0

    repeat(row){
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        firstArray += a
        secondArray += b
    }

    for (firstElement in firstArray){
        result += secondArray.count { firstElement == it }
    }

    println(result)
}