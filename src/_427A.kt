import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var crime = 0
    var force = 0
    val len = scanner.nextLine().toInt()
    val temp = scanner.nextLine()
    val inputs = temp.split(" ")

    for (i in 0 until len){
        when(inputs[i].toInt()){
            -1 -> if (force>0) force-- else crime++
            else -> force += inputs[i].toInt()
        }
    }
    println(crime)
    scanner.close()
}