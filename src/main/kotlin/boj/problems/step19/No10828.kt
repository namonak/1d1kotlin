package boj.problems.step19

import java.io.BufferedReader
import java.io.IOException
import java.util.StringTokenizer

class No10828 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val stack = Stack()
        for (i in 0 until n) {
            executeOperation(input.readLine(), stack, result)
        }
        return result.toString().trimEnd()
    }

    private fun executeOperation(
        operation: String,
        stack: Stack,
        result: StringBuilder
    ) {
        val st = StringTokenizer(operation, " ")
        when (st.nextToken()) {
            "push" -> stack.push(st.nextToken().toInt())
            "pop" -> result.append(stack.pop()).append("\n")
            "size" -> result.append(stack.size()).append("\n")
            "empty" -> result.append(stack.empty()).append("\n")
            "top" -> result.append(stack.top()).append("\n")
        }
    }

    internal class Stack {
        private var arr = intArrayOf()
        private var size = 0

        fun push(data: Int) {
            arr = arr.copyOf(size + 1)
            arr[size] = data
            size++
        }

        fun pop(): Int {
            if (size == 0) {
                return -1
            }
            val ret = arr[size - 1]
            arr[size - 1] = 0
            size--
            return ret
        }

        fun size(): Int {
            return size
        }

        fun empty(): Int {
            if (size == 0) {
                return 1
            }
            return 0
        }

        fun top(): Int {
            if (size == 0) {
                return -1
            }
            return arr[size - 1]
        }
    }
}
