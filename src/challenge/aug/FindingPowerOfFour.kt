package challenge.aug

import java.lang.Math.log
import java.lang.Math.pow
import kotlin.math.pow

class FindingPowerOfFour {
    fun isPowerOfFour(num: Int): Boolean {
        if (num == 0) return false
        val pow = (log(num.toDouble()) / log(4.0)).toInt()
        return if (num.toDouble() == pow(4.0, pow.toDouble())) {
            true
        } else {
            false
        }
    }
}
fun main(){
    var test = FindingPowerOfFour();
    println(test.isPowerOfFour(4))
    println(test.isPowerOfFour(6))
    //println(test.isPalindrome("A man, a plan, a canal: Panama"))
    //println(test.isPalindrome("race a car"))


}

