package challenge.aug


class Node {
    var letter:Char?=null
    var isLeaf:Boolean = false
}
/*
class PTNode{
    var letters: HashMap<Char, Node?> = hashMapOf<Char, Node?>()
}
 */
class PTNode {
    var letters: HashMap<Char, PTNode?> = hashMapOf<Char, PTNode?>()
}

class PrefixTree {

    var head: PTNode? = PTNode()

    /** Inserts a word into the trie. */
    fun addWord(word: String) {
        var curNode: PTNode? = head
        word.forEach { chr ->

            if (curNode == null) {
                var temp = PTNode()
                curNode = temp
                head = curNode
            } else {
                if (curNode?.letters?.get(chr) == null) {
                    var temp = PTNode()
                    curNode?.letters?.put(chr, temp)
                    curNode = temp
                } else {
                    curNode = curNode?.letters?.get(chr)
                }
            }
        }
        //if (curNode!=null) curNode?.isLeaf = true
    }

/*
    fun isCharPresent(letter:Char, nPNode: HashMap<Char, PNode?>):Boolean{
        if(nPNode == null) return false
        if (nPNode?.isEmpty()) return false
        return pNode?.letters?.get(chr)!=null
    }
*/



    fun search(word: String): Boolean {
        var curNode: PTNode? = head
        var prevDot:Int = 0
        if (word.length == 0 || curNode == null) return false

        word.forEach { chr ->
            if (chr != '.') {
                val letter:PTNode? = if (prevDot>0) {
                    var tmpNode:PTNode?= null
                    run loop@{
                        curNode?.letters?.forEach {
                            tmpNode = it.value?.letters?.get(chr)
                            if (tmpNode != null) {
                                prevDot--
                                return@loop
                            }
                        }
                    }
                    tmpNode
                } else {
                    curNode?.letters?.get(chr)
                }


                if (letter != null) {
                    curNode = letter
                } else {
                    return false
                }
            } else {
                prevDot++
            }

        }

        return if(prevDot/2 ==0 && prevDot > 0)  false else true
    }
}

//["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
//[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]

//["WordDictionary","addWord","addWord","search","search","search","search","search","search"]
//[[],              ["a"],["a"],["."],["a"],["aa"],["a"],[".a"],["a."]]


/*
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
Output:
[null,null,null,null,false,true,true,false]
Expected:
[null,null,null,null,false,true,true,true]
*/


fun main() {
    var test = PrefixTree();

/*
    test.addWord("a")
    test.addWord("a")
    println(test.search("."))
    test.addWord("a")
    test.addWord("aa")
    println(test.search(".a"))
    println(test.search("a."))

*/
    (test.addWord("bad"))
    (test.addWord("dad"))
    (test.addWord("mad"))
    (test.addWord("pad"))
    println(test.search(".ab"))
    println(test.search("b.."))


    //println(test.insert("USA"))
    //println(test.isPalindrome("A man, a plan, a canal: Panama"))
    //println(test.isPalindrome("race a car"))


}

