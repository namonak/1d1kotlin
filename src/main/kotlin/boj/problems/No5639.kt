package boj.problems

import java.io.BufferedReader

class No5639 {
    private val result = StringBuilder()

    data class Node(val value: Int, var left: Node?, var right: Node?) {
        fun addChildNode(value: Int) {
            if (value < this.value) {
                if (left == null) {
                    left = Node(value, null, null)
                } else {
                    left!!.addChildNode(value)
                }
            } else {
                if (right == null) {
                    right = Node(value, null, null)
                } else {
                    right!!.addChildNode(value)
                }
            }
        }
    }

    fun solve(input: BufferedReader): String {
        val root = Node(input.readLine().toInt(), null, null)

        input.lineSequence().forEach { line ->
            if (line.isNotBlank()) {
                root.addChildNode(line.toInt())
            }
        }

        postOrderTraversal(root)

        return result.toString().trim()
    }

    private fun postOrderTraversal(node: Node?) {
        if (node == null) return
        postOrderTraversal(node.left)
        postOrderTraversal(node.right)
        result.append("${node.value}\n")
    }
}
