package boj.problems

import java.io.BufferedReader

class No12869 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val hpList = input.readLine().trim().split(" ").map {
            it.toInt()
        }.toMutableList()

        while (hpList.size < MAX_SCV_COUNT) {
            hpList.add(0)
        }

        val firstState = State(hpList[0], hpList[1], hpList[2]).normalized()
        val queue = ArrayDeque<Node>()
        val isVisited = HashSet<State>()
        queue.add(Node(firstState, 0))
        isVisited.add(firstState)

        while (queue.isNotEmpty()) {
            val currNode = queue.removeFirst()

            if (currNode.state.isAllZero()) {
                return currNode.depth.toString()
            }

            for (pattern in DAMAGE_PATTERNS) {
                val nextNode = State(
                    currNode.state.a - pattern[0],
                    currNode.state.b - pattern[1],
                    currNode.state.c - pattern[2]
                ).normalized()

                if (nextNode !in isVisited) {
                    isVisited.add(nextNode)
                    queue.add(Node(nextNode, currNode.depth + 1))
                }
            }
        }

        return "-1"
    }

    private data class State(val a: Int, val b: Int, val c: Int) {
        fun normalized(): State {
            val sorted = listOf(a, b, c)
                .map { if (it < 0) 0 else it }
                .sortedDescending()
            return State(sorted[0], sorted[1], sorted[2])
        }

        fun isAllZero(): Boolean = a == 0 && b == 0 && c == 0
    }

    private data class Node(
        val state: State,
        val depth: Int,
    )

    private companion object {
        const val MAX_SCV_COUNT = 3
        val DAMAGE_PATTERNS = arrayOf(
            intArrayOf(9, 3, 1),
            intArrayOf(9, 1, 3),
            intArrayOf(3, 9, 1),
            intArrayOf(3, 1, 9),
            intArrayOf(1, 9, 3),
            intArrayOf(1, 3, 9)
        )
    }
}
