package challenge.aug

class FindAllDuplicates {
    fun findDuplicates(nums: IntArray): List<Int> {
        var duplicates:MutableList<Int> = mutableListOf()
        nums.forEachIndexed { index, i ->
            for (n in 0..index-1){
                if (nums[index] == nums[n]) {
                    duplicates.add(nums[n])
                }
            }
        }
        return duplicates
    }

    fun findDuplicates2(nums: IntArray): List<Int> {
        var duplicates:MutableList<Int> = mutableListOf()

        for (i in 0..nums.size -1 ) {
            val a = nums[i]
            val b = nums[Math.abs(a)-1]

            if(b < 0) {
                duplicates.add(Math.abs(a))
            } else {
                nums[Math.abs(a)-1] = -nums[Math.abs(a)-1]
            }

        }

        return duplicates
    }
}
fun main(){
    var test = FindAllDuplicates();
    println(test.findDuplicates2(intArrayOf(4,3,2,7,8,8,2,3,1)))
       //println(test.isPalindrome("A man, a plan, a canal: Panama"))
    //println(test.isPalindrome("race a car"))

}

