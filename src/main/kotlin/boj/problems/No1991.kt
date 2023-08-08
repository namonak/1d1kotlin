package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1991.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1991 {
    val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val nodes = mutableMapOf<Char, Node>()

        for (i in 'A'..'Z') {
            nodes[i] = Node(i)
        }

        repeat(n) {
            val (parent, left, right) = input.readLine().split(" ")
            if (left != ".") {
                nodes[parent[0]]?.left = nodes[left[0]]
            }
            if (right != ".") {
                nodes[parent[0]]?.right = nodes[right[0]]
            }
        }

        preorder(nodes['A'])
        result.append("\n")
        inorder(nodes['A'])
        result.append("\n")
        postorder(nodes['A'])

        return result.toString()
    }

    private fun preorder(node: Node?) {
        if (node == null) return
        result.append(node.value)
        preorder(node.left)
        preorder(node.right)
    }

    private fun inorder(node: Node?) {
        if (node == null) return
        inorder(node.left)
        result.append(node.value)
        inorder(node.right)
    }

    private fun postorder(node: Node?) {
        if (node == null) return
        postorder(node.left)
        postorder(node.right)
        result.append(node.value)
    }

    data class Node(val value: Char) {
        var left: Node? = null
        var right: Node? = null
    }
}
