package trees.binary

import trees.TreeNode
import kotlin.math.max

class BinaryTree {
    private var root:TreeNode?=null
    fun <T: Any, R: Any> Collection<T?>.whenAnyNotNull(block: (List<T>)->R) {
        if (this.any { it != null }) {
            block(this.filterNotNull())
        }
    }
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        listOf(root, p,q).whenAnyNotNull {
            //if(it.get(0).`val` == root.)
        }
        if (root !=null &&root.left!=null&&root.right!=null && p!= null && q!=null){
            if (root!!.left!!.`val` == p.`val` && root!!.right!!.`val` == q.`val`) return root
        }
        return root?.let {
            val lnode = lowestCommonAncestor(it.left, p,q)
            val rnode = lowestCommonAncestor(it.right, p,q)
            if(lnode == null) rnode
            else if(rnode == null) lnode
            else root
        } ?: run {
            root
        }
    }



}

val mapheight = mutableMapOf<Int, MutableList<Int>>()
fun height(root: TreeNode?):Int{
    if (root == null) return 0
    val lheight =  height(root.left)
    val rheight =  height(root.right)
    val maxHeight = max(lheight, rheight)+1
    if (mapheight.containsKey(maxHeight)){
        mapheight.get(maxHeight)?.let {
            var tmpArray:MutableList<Int> = it
            tmpArray.add(root.`val`)
        }
    }else {
        mapheight.put(maxHeight, mutableListOf(root.`val`) )
    }
    return maxHeight
}
fun traverse(root: TreeNode?, lheight:Int, rheight:Int){
    var  lheight:Int = lheight
    var rheight:Int = rheight
    root?.let {
        it.left.let {
            traverse(it, lheight++, rheight)
        }
        it.right.let {
            traverse(it,lheight, rheight++)
        }
        println("" + it.`val` + ":" + lheight + ":" + rheight)
    }
}
fun main() {
    val bst  =BinaryTree()
    val root = TreeNode().apply { this.`val`=3 }
    root.left = TreeNode().apply { this.`val`=9 }
    //root!!.left!!.left = TreeNode().apply { this.`val`=1 }
    //root!!.left!!.right = TreeNode().apply { this.`val`=5 }
    root.right = TreeNode().apply { this.`val`=20 }
    root!!.right!!.left = TreeNode().apply { this.`val`=15 }
    root!!.right!!.right = TreeNode().apply { this.`val`=7 }
    println(height(root))

    //println(BinaryTree().lowestCommonAncestor(root, root!!.left!!.left,root!!.left!!.right)?.`val`)

}