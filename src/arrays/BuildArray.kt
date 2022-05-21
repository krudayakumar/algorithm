package arrays

class BuildArray {
        fun buildArray(nums: IntArray): IntArray {
            var temp:IntArray = IntArray(nums.size)
            nums.toList().forEachIndexed{index: Int, i: Int ->  
                temp[index] = nums[nums[index]]
            }
            return temp
        }
}

fun main() {
    BuildArray().buildArray(intArrayOf(5,0,1,2,3,4)).forEach { println(it) }
    //println(BuildArray().buildArray(intArrayOf(0,2,1,5,3,4)))

}