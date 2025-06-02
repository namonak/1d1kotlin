package boj.problems

import java.io.BufferedReader

class No1068() {
    data class Node(
        val id: Int,
        val children: MutableList<Node> = mutableListOf()
    )

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val parents = input.readLine().split(" ").map { it.toInt() }
        val deleteNode = input.readLine().toInt()
        var root: Node? = null

        val nodes = Array(n) { Node(it) }

        for (i in 0 until n) {
            if (parents[i] == -1) {
                root = nodes[i]
            } else {
                nodes[parents[i]].children.add(nodes[i])
            }
        }

        val remainingCount = countRemainingNodes(root, deleteNode)
        return remainingCount.toString()
    }

    private fun countRemainingNodes(node: Node?, deleteNode: Int): Int {
        if (node == null || node.id == deleteNode) return 0
        if (node.children.isEmpty()) return 1

        var count = 0
        for (child in node.children) {
            count += countRemainingNodes(child, deleteNode)
        }

        return if (count == 0) 1 else count
    }
}
