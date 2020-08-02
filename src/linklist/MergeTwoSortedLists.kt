package linklist

class MergeTwoSortedLists {
    var head: ListNode? = null
    fun addNode(d: Int) {
        var temp = ListNode(d)
        if (head == null) {
            head = temp
        } else {
            var ptr: ListNode? = head
            while (ptr?.next != null) {
                ptr = ptr.next
            }
            ptr?.next = temp
        }

    }

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        var header: ListNode? = null
        var curNode: ListNode? = null
        var isFirstTime: Boolean = true
        //Adding all the list to fnode
        lists.let { nodes ->
            if (nodes.isNotEmpty()) {
                nodes.forEachIndexed { index, listNode ->
                    listNode?.let {
                        if (isFirstTime) {
                            header = listNode
                            curNode = listNode
                            isFirstTime = false
                        } else {
                            curNode?.next = listNode
                        }
                        while (curNode?.next != null) {
                            curNode = curNode?.next
                        }
                    }
                }
            }
        }

        //Sorting the fnode.
        header?.let {
            var inital: ListNode? = it
            var curNode: ListNode? = it
            while (inital != null) {
                inital?.let { ini ->
                    var first = ini.`val`
                    println("F:" + first)
                    while (curNode != null) {
                        var second = curNode?.`val` ?: 0
                        println("\tS:" + second)
                        if (ini.`val` > second) {
                            val t = ini.`val`
                            ini.`val` = second
                            curNode?.`val` = t
                        }
                        curNode = curNode?.next
                    }
                }
                inital = inital.next
                curNode = inital
            }
        }
        return header
    }


    fun sortedSquares(A: IntArray): IntArray {
        A.forEachIndexed { index, i ->
            A[index] = i * i
        }
        A.sort()
        return  A
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        val out:IntArray = IntArray(m+n)
        for (num in m..m+n-1) {
                nums1[num] = nums2[num-m]
        }
        nums1.sort()
        return nums1
    }

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val lists: Array<ListNode?> = arrayOf(l1,l2)
        var header: ListNode? = null
        var curNode: ListNode? = null
        var isFirstTime: Boolean = true
        //Adding all the list to fnode

        lists.let { nodes ->
            if (nodes.isNotEmpty()) {
                nodes.forEachIndexed { index, listNode ->
                    listNode?.let {
                        if (isFirstTime) {
                            header = listNode
                            curNode = listNode
                            isFirstTime = false
                        } else {
                            curNode?.next = listNode
                        }
                        while (curNode?.next != null) {
                            curNode = curNode?.next
                        }
                    }
                }
            }
        }

        //Sorting the fnode.
        header?.let {
            var inital: ListNode? = it
            var curNode: ListNode? = it
            while (inital != null) {
                inital?.let { ini ->
                    var first = ini.`val`
                     while (curNode != null) {
                        var second = curNode?.`val` ?: 0
                        if (ini.`val` > second) {
                            val t = ini.`val`
                            ini.`val` = second
                            curNode?.`val` = t
                        }
                        curNode = curNode?.next
                    }
                }
                inital = inital.next
                curNode = inital
            }
        }
        return header
    }


    fun nthNode(n: Int): ListNode? {
        var ptr: ListNode? = head
        var nodCnt = 0
        if (n < 0)
            return null
        do {
            nodCnt++
            if (n == nodCnt) {
                return ptr
            }
            ptr = ptr?.next
        } while (ptr != null)
        return null
    }

    fun print(h: ListNode?) {
        var ptr: ListNode? = h
        do {
            println(ptr?.`val`)
            ptr = ptr?.next
        } while (ptr != null)
    }

}


fun main() {
    var output = MergeTwoSortedLists()
    var l1 = MergeTwoSortedLists()
 /*   l1.addNode(10)
 l1.addNode(20)
    l1.addNode(30)
    l1.addNode(40)
    l1.addNode(50)
    l1.addNode(60)
    l1.addNode(70)
    l1.addNode(80)
    l1.addNode(90)*/

    var l2 = MergeTwoSortedLists()
    l2.addNode(1)
    /* l2.addNode(2)
     l2.addNode(3)
     l2.addNode(4)
     l2.addNode(5)*/


    var l3 = MergeTwoSortedLists()
    /* l3.addNode(11)
    l3.addNode(21)
     l3.addNode(31)
     l3.addNode(41)
     l3.addNode(51)
     l2.addNode(6)
     l2.addNode(7)
     l2.addNode(8)
     l2.addNode(9)*/
    output.mergeTwoLists(l1.head, l2.head)
    //output.mergeKLists(arrayOf(l1.head, l2.head, l3.head))

    println(output.merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6),3))

}