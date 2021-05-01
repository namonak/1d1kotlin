package ds.graph

class Node(val mKey: Int, var mLeft: Node? = null, var mRight: Node? = null) {
    fun insert(key: Int) {
        if (key < this.mKey) {
            if (this.mLeft == null) mLeft = Node(key)
            else this.mLeft?.insert(key)
        } else {
            if (this.mRight == null) mRight = Node(key)
            else this.mRight?.insert(key)
        }
    }
}