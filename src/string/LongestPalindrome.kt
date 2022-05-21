package string



class LongestPalindrome {
    fun longestPalindrome(str: String): String {
        val s = str
        val palString:ArrayList<String> = arrayListOf()
        if ((s.length <= 0 || s.length > 1000 || s.containsInt())) {
            throw IllegalArgumentException("String is invalid")
        }
//        if (s.length == 1 ) return  s
//        if (s.length == 2) return if(s[0] == s[1]) s else s[0].toString()

        var maxLength = 0
        var str:String = ""

        if(s.isPalindrome())
            return s

        var mid:Int = 0
        //odd scenario

        mid = str.length / 2

/*

        for ()

        s.forEachIndexed { mid, c ->
            var lenofloop =









            for(r in 0..s.length - l) {
                val subStr  =s.substring(l,r-l)

                if(subStr.isPalindrome() == true)
                    if(maxLength<subStr.length) {
                        maxLength = subStr.length
                        str = subStr
                        println(subStr)
                    }
                   }
            }*/
        return  str
        }


//
//        s.forEachIndexed { index, chr ->
//
//            var nexIndex: Int = s.substring(index+1..s.length-1).reversed().indexOf(chr)
//            if (nexIndex >= 0) {
//                val subStr:String =s.substring(index ..   s.length - nexIndex-1)
//                if(subStr.isPalindrome()){
//                    palString.add(subStr)
//                }
//            }
//        }
//
//        var maxLengthIndex:Int = 0
//        palString.forEachIndexed { index, s ->  if (s.length > maxLengthIndex) {maxLengthIndex = s.length} }
//        return palString.filter { it.length == maxLengthIndex }.firstOrNull() ?: ""
 //   }




}
fun String.containsInt(): Boolean {
    return this.filter { it.isDigit() }.length != 0
}
fun String.isPalindrome(): Boolean {
    var s = this
    if (s.isNullOrEmpty() || s.trim().isNullOrEmpty()) return false
    s = s.trim()
    val index = s.length / 2
    var left = s.substring(0, index)
    var right = s.substring(s.length - index, s.length)
    return left == right.reversed()
}

fun main() {
    var longestPalindrome = LongestPalindrome()
    println("bab".isPalindrome())
    println("final" + longestPalindrome.longestPalindrome("babad"))
    println(longestPalindrome.longestPalindrome("cbbd"))
    println(longestPalindrome.longestPalindrome("ac"))
    println(longestPalindrome.longestPalindrome("ccc"))
    println(longestPalindrome.longestPalindrome("cacac"))
}