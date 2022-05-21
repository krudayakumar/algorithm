package arrays

class ConcatenationArray {
        fun getConcatenation(nums: IntArray): IntArray {
            return (nums.toList() + nums.toList()).toIntArray()
        }
}

fun main() {
    ConcatenationArray().getConcatenation(intArrayOf(5,0,1,2,3,4)).forEach { println(it) }
    //println(BuildArray().buildArray(intArrayOf(0,2,1,5,3,4)))

}