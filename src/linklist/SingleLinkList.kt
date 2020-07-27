package linklist

class SingleLinkList {
    var head:SNode?= null
    fun addNode(d:Any){
        var temp = SNode(d, null)
        if(head == null) {
            head = temp
        }else {
            var ptr:SNode? = head
            while (ptr?.next!=null) {
                ptr = ptr.next
            }
            ptr?.next = temp
        }

    }


    fun nthNode(n:Int):SNode?{
        var ptr:SNode? = head
        var nodCnt = 0
        if(n < 0 )
            return null
        do{
            nodCnt++
            if(n == nodCnt){
                return ptr
            }
           ptr = ptr?.next
        }while (ptr!=null)
        return null
    }

    fun print(){
        var ptr:SNode? = head
        do{
           ptr = ptr?.next
        }while (ptr!=null)
    }

}


fun main() {
    var singleLinkList = SingleLinkList()
    singleLinkList.addNode(10)
    singleLinkList.addNode(20)
    singleLinkList.addNode(30)
    singleLinkList.addNode(40)
    var a= singleLinkList.nthNode(1)
    a?.let {
        println(it.data as Int)
    }
    //singleLinkList.print()
}