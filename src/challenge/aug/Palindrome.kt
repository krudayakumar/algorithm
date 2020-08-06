package challenge.aug

import java.lang.Math.log
import java.lang.Math.pow
import kotlin.math.pow

class Palindrome {
    fun isPalindrome(s: String): Boolean {
        var tmp = s.filter { it.isLetterOrDigit() }.toLowerCase()
        if(tmp.length ==0) return true
        if(s == null) return false

        for (n in 0..tmp.length/2){
            if (tmp[n].toLowerCase() != tmp[tmp.length-1 -n].toLowerCase()) {
                return false
            }
        }
        return true
    }


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
    var test = Palindrome();
    println(test.isPalindrome(" "))
    println(test.isPowerOfFour(4))
    println(test.isPowerOfFour(6))
    //println(test.isPalindrome("A man, a plan, a canal: Panama"))
    //println(test.isPalindrome("race a car"))


}

