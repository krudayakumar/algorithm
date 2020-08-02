package challenge.aug

class MyHashSet() {

    /** Initialize your data structure here. */
    var hash = mutableMapOf<Int, Int>()

    fun add(key: Int) {
        hash.put(key,key)
    }

    fun remove(key: Int) {
        hash.remove(key,key)
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        return hash.containsKey(key)
    }
}
fun main(){
    var test = MyHashSet();

    test.add(10)
    test.add(20)
    test.add(30)
    test.add(40)


    println(test.contains(50))


}
