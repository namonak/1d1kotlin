package boj.problems.step19

import java.io.*
import java.util.*

object No10828 {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))
        output.write(solve(input))
        input.close()
        output.flush()
        output.close()
    }

    @Throws(IOException::class)
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val stack = Stack(n)
        for (i in 0 until n) {
            val st = StringTokenizer(input.readLine(), " ")
            when (st.nextToken()) {
                "push" -> stack.push(st.nextToken().toInt())
                "pop" -> result.append(stack.pop()).append("\n")
                "size" -> result.append(stack.size()).append("\n")
                "empty" -> result.append(stack.empty()).append("\n")
                "top" -> result.append(stack.top()).append("\n")
            }
        }
        return result.toString()
    }

    internal class Stack(stackSize: Int) {
        var size = 0
        private var arr: IntArray

        init {
            arr = IntArray(stackSize)
        }

        fun push(data: Int) {
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
