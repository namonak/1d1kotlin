package boj.problems.step28

import java.io.BufferedReader
import java.util.PriorityQueue
import kotlin.math.abs

class No11286 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val priorityQueue = PriorityQueue<Int> { o1, o2 ->
            val abs1 = abs(o1)
            val abs2 = abs(o2)
            // 두 값의 값이 같을 경우, 부호를 비교해서 오름차순으로 정렬.
            // 두 값이 다를 경우, 그냥 절댓값에서 숫자의 크기로 비교해서 오름차순으로 정렬
            when (abs1) {
                abs2 -> o1 - o2
                else -> abs1 - abs2
            }
        }
        val result = mutableListOf<Int>()

        for (i in 0 until count) {
            val number = input.readLine().toInt()
            if (number == 0) {
                if (priorityQueue.isEmpty()) {
                    result.add(0)
                } else {
                    result.add(priorityQueue.poll())
                }
            } else {
                priorityQueue.add(number)
            }
        }

        return result.joinToString("\n")
    }
}
