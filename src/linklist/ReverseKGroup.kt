package linklist

class ReverseKGroup {

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

    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var h1: ListNode? = head
        var curr: ListNode? = head
        var nodCnt = 0

        while (curr != null) {
            if (nodCnt % k == 0 && nodCnt!=0) {
                var endNode = curr
                //print(reverseLinkList(h1,endNode))
                h1 = endNode?.next
            }
            nodCnt++
            curr = curr?.next
        }


        return head
    }

    fun reverseLinkList(head: ListNode?, endNode:ListNode?): ListNode? {
        var curNode: ListNode? = head
        var preNode: ListNode? = null
        var nextNode:ListNode? = head
        while (curNode != endNode) {
            nextNode = nextNode?.next
            curNode?.next = preNode
            preNode = curNode
            curNode = nextNode
           }
        return preNode
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

    var l1 = ReverseKGroup()
    l1.addNode(10)
    l1.addNode(20)
    l1.addNode(30)
    l1.addNode(40)
    l1.addNode(50)
    l1.addNode(60)
    l1.addNode(70)
    l1.addNode(80)
    l1.addNode(90)


    //l1.print(l1.reverseLinkList(l1.head))
    l1.reverseKGroup(l1.head, 3)

}