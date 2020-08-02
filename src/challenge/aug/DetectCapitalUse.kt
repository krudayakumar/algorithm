package challenge.aug

class DetectCapitalUse {
    fun detectCapitalUse(word: String): Boolean {
        if(word.length ==0 ) return false
        var allCaps:Int =0
        var capsInMiddle:Boolean = false
        var allSmall:Int =0
        word.forEachIndexed { index, c ->
            if(c >= 'A' && c <'Z'){
                    allCaps++
            }
            if (c >= 'a' && c <='z'){
                allSmall++
            }
            if (c >= 'A' && c <='Z' && index > 0 ){
                capsInMiddle = true
            }
        }
        if (allCaps == word.length || allCaps==word.length ) return true
        if (capsInMiddle) return false

        return true
    }
}
fun main() {
    var output = DetectCapitalUse()
    println(output.detectCapitalUse("uZfa"))
}

