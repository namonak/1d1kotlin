package ds.list.linkedList

class LinkedList() {
    var mHead: Node? = null

    class Node(var value: Int) {
        var next: Node? = null
    }

    fun add(value: Int) {
        val node = Node(value)
        if (mHead == null) {
            mHead = node
        } else {
            var current = mHead
            while (current?.next != null) {
                current = current.next
            }
            current?.next = node
        }
    }

    fun clear() {
        while (mHead != null) {
            val next = mHead?.next
            mHead = null
            mHead = next
        }
        mHead = null
    }
}