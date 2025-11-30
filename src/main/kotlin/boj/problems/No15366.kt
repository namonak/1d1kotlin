package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No15366 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        val wandLengths = readIntList(input, n)
        val boxSizes = readIntList(input, n)

        wandLengths.sort()
        boxSizes.sort()

        return if (canFitAll(wandLengths, boxSizes)) "DA" else "NE"
    }

    private fun readIntList(
        input: BufferedReader,
        count: Int
    ): MutableList<Int> {
        val st = StringTokenizer(input.readLine())
        return MutableList(count) { st.nextToken().toInt() }
    }

    private fun canFitAll(
        wands: List<Int>,
        boxes: List<Int>
    ): Boolean {
        for (i in wands.indices) {
            if (wands[i] > boxes[i]) {
                return false
            }
        }
        return true
    }
}
