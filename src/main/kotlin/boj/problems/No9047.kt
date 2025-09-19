package boj.problems

import java.io.BufferedReader

private const val KAPREKAR_CONSTANT = 6174

class No9047 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val results = mutableListOf<Int>()
        repeat(t) {
            val n = input.readLine().toInt()
            var count = 0
            var current = n
            while (current != KAPREKAR_CONSTANT) {
                current = kaprekarStep(current)
                count++
            }
            results.add(count)
        }
        return results.joinToString("\n").trimEnd()
    }

    private fun kaprekarStep(n: Int): Int {
        val s = "%04d".format(n)
        val asc = s.toCharArray().sorted().joinToString("")
        val desc = asc.reversed()
        return desc.toInt() - asc.toInt()
    }
}
