package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2042 {
    fun solve(input: BufferedReader): String {
        var st = StringTokenizer(input.readLine().trim())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        val fenwickTree = FenwickTree(n)

        for (i in 1..n) {
            val value = input.readLine().toLong()
            fenwickTree.setValue(i, value)
        }

        val sb = StringBuilder()
        val operations = m + k
        repeat(operations) {
            st = StringTokenizer(input.readLine())
            val type = st.nextToken().toInt()
            val b = st.nextToken().toInt()

            if (type == 1) {
                val c = st.nextToken().toLong()
                fenwickTree.setValue(b, c)
            } else if (type == 2) {
                val c = st.nextToken().toInt()
                val sum = fenwickTree.rangeSum(b, c)
                sb.append(sum).append("\n")
            }
        }

        return sb.toString().trimEnd()
    }

    private class FenwickTree(private val size: Int) {
        private val tree = LongArray(size + 1)
        private val elements = LongArray(size + 1)

        fun setValue(
            index: Int,
            newValue: Long
        ) {
            val diff = newValue - elements[index]
            elements[index] = newValue
            update(index, diff)
        }

        private fun update(
            index: Int,
            diff: Long
        ) {
            var i = index
            while (i <= size) {
                tree[i] += diff
                i += (i and -i)
            }
        }

        fun rangeSum(
            start: Int,
            end: Int
        ): Long {
            return query(end) - query(start - 1)
        }

        private fun query(index: Int): Long {
            var sum = 0L
            var i = index
            while (i > 0) {
                sum += tree[i]
                i -= (i and -i)
            }
            return sum
        }
    }
}
