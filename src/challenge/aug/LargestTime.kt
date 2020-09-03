package challenge.aug

class LargeTime {

    fun largestTimeFromDigits(a: IntArray): String {

        if(a.size ==0 || a.size > 4) return  ""

        val temp:MutableSet<Int> = mutableSetOf()
        a.forEachIndexed { index, i ->
            for (j in index+1..a.size-1){
                temp.add(( ""+ i + "" +a[j]).toInt())
            }
        }
       a.reverse()
       a.forEachIndexed { index, i ->

            for (j in index+1..a.size-1){
                temp.add(( ""+ i + "" +a[j]).toInt())
            }
        }

        val hrs = temp.filter { i-> i<=23 }.max()
        val mins = temp.filter { i-> i<=60 }.max()

        return if (hrs == null || mins == null ) "" else hrs.toString()+ ":" + mins

    }

}

fun main() {

    println(LargeTime().largestTimeFromDigits(intArrayOf(1,2,3,4)))

}
