package arrays

class RunningSum {
        fun runningSum(nums: IntArray): IntArray {
            nums.forEachIndexed { index, i ->
                if (index>0) {
                    nums[index] = nums[index-1] + nums[index]
                }
            }
            return nums
        }
}

fun main() {
    RunningSum().runningSum(intArrayOf(5,0,1,2,3,4)).forEach { println(it) }
    //println(BuildArray().buildArray(intArrayOf(0,2,1,5,3,4)))
   
}