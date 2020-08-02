package linklist

class RemoveNthNode {
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


    fun removeNthNode(head: ListNode?, n: Int): ListNode? {
        var ptr: ListNode? = head
        var prev: ListNode? = null
        var nodCnt = 0
        if (n < 0)
            return null
        if(n == 0)
            return head

        do {

            if (nodCnt >= n ) {
                if (prev == null) {
                    prev = head
                } else {
                    prev = prev?.next
                }
            }
            ptr = ptr?.next
            nodCnt++
        } while (ptr!=null)

        if (prev!=null){
            var cur  = prev?.next
            var next = cur?.next
            if (cur == head){
              head?.next = next
            }else if(next == null){
                prev.next = null
            }else {
                prev.next = next
            }
        }else {
            if (nodCnt == n) {
                return head?.next
            }
        }

       return head
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
    var singleLinkList = RemoveNthNode()
    singleLinkList.addNode(10)
    singleLinkList.addNode(20)
    singleLinkList.addNode(30)
    singleLinkList.addNode(40)
    singleLinkList.addNode(50)
    singleLinkList.addNode(60)
    singleLinkList.addNode(70)
    singleLinkList.addNode(80)
    singleLinkList.addNode(90)

    singleLinkList.print(singleLinkList.removeNthNode(singleLinkList.head, 13))
}