package ds.list.singlyLinkedList

class SinglyLinkedList() {
    var mHead: Node? = null

    class Node(var value: Int) {
        var next: Node? = null
    }

    // O(n)
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

    // O(1)
    fun addAtHead(value: Int) {
        val node = Node(value)
        node.next = mHead
        mHead = node
    }

    // O(n)
    fun addBack(value: Int) {
        if (mHead == null) return

        val node = Node(value)
        var current = mHead

        while (current?.next != null) {
            current = current.next
        }
        current?.next = node
    }

    // O(1)
    fun addAfter(node: Node, value: Int) {
        if (mHead == null) return

        val newNode = Node(value)
        newNode.next = node.next
        node.next = newNode
    }

    // O(n)
    fun findNode(value: Int): Node? {
        var current = mHead
        while (current != null) {
            if (current.value == value) {
                return current
            }
            current = current.next
        }
        return null
    }

    // O(1)
    fun deleteAfter(prevNode: Node) {
        if (mHead == null || prevNode.next == null) return

        prevNode.next = prevNode.next?.next
    }

    // O(1)
    fun clear() {
        mHead = null
    }
}