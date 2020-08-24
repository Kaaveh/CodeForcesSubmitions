import kotlin.math.floor
import kotlin.math.log10

fun main(){
    println(floor(log10(123456.0)).toInt() + 1)
    println(floor(log10(999999.0)).toInt() + 1)
    println(floor(log10(000000.0)).toInt() + 1)
    println(floor(log10(000001.0)).toInt() + 1)
}