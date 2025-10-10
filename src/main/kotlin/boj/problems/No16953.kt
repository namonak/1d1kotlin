package boj.problems

import java.io.BufferedReader

class No16953 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toLong() }
        return minOperations(a.toInt(), b.toInt()).toString()
    }

    private fun minOperations(
        a: Int,
        b: Int
    ): Int {
        val queue = ArrayDeque<Pair<Long, Int>>()
        queue.add(a.toLong() to 1) // 초기값을 큐에 넣고 연산 횟수를 1로 시작

        while (queue.isNotEmpty()) {
            val (current, operations) = queue.removeFirst()

            // 현재 값이 목표 값과 같다면 연산 횟수 반환
            if (current == b.toLong()) return operations

            // 다음 가능한 연산을 수행하여 큐에 추가
            if (current * 2 <= b) queue.add(current * 2 to operations + 1)
            if (current * 10 + 1 <= b) queue.add(current * 10 + 1 to operations + 1)
        }
        return -1 // 목표 값에 도달할 수 없는 경우
    }
}
