package kotlinLan

fun main(){
    var crime = 0
    var force = 0
    val len = readLine()!!.toInt()
    val temp = readLine()!!
    val inputs = temp.split(" ").map { it.toInt() }

    for (i in 0 until len){
        when(inputs[i]){
            -1 -> if (force>0) force-- else crime++
            else -> force += inputs[i]
        }
    }
    println(crime)
}