package boj.problems

import java.io.BufferedReader

class No1406 {
    fun solve(input: BufferedReader): String {
        val initial = input.readLine()
        val m = input.readLine().toInt()

        val left = ArrayDeque<Char>()
        val right = ArrayDeque<Char>()

        // 초기 문자열을 모두 left 스택에 넣음 (커서는 맨 뒤)
        initial.forEach { left.addLast(it) }

        repeat(m) {
            when (val command = input.readLine()) {
                "L" -> if (left.isNotEmpty()) right.addFirst(left.removeLast())
                "D" -> if (right.isNotEmpty()) left.addLast(right.removeFirst())
                "B" -> if (left.isNotEmpty()) left.removeLast()
                else -> { // P x
                    val c = command.last()
                    left.addLast(c)
                }
            }
        }

        return buildString {
            left.forEach { append(it) }
            right.forEach { append(it) }
        }
    }
}
