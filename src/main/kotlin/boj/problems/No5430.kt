package boj.problems

import java.io.BufferedReader

class No5430 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val p = input.readLine()
            val n = input.readLine().toInt()
            val arrInput = input.readLine()

            val arr = if (n == 0) ArrayDeque() else {
                arrInput.drop(1).dropLast(1).split(",").map { it.toInt() }.toCollection(ArrayDeque())
            }

            var isReversed = false
            var errorOccurred = false

            for (operation in p) {
                when (operation) {
                    'R' -> isReversed = !isReversed
                    'D' -> {
                        if (arr.isEmpty()) {
                            result.append("error\n")
                            errorOccurred = true
                            break
                        }
                        if (isReversed) {
                            arr.removeLast()
                        } else {
                            arr.removeFirst()
                        }
                    }
                }
            }

            if (!errorOccurred) {
                if (isReversed) arr.reverse()
                result.append(arr.joinToString(",", "[", "]")).append("\n")
            }
        }

        return result.toString().trimEnd()
    }
}
