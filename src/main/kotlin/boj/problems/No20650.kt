package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No20650 {
    fun solve(input: BufferedReader): String {
        val numbers = readNumbers(input)
        numbers.sort()

        val a = numbers[0]
        val b = numbers[1]
        val c = numbers.last() - a - b

        return "$a $b $c"
    }

    private fun readNumbers(input: BufferedReader): MutableList<Int> {
        val st = StringTokenizer(input.readLine())
        val list = mutableListOf<Int>()
        repeat(7) { list.add(st.nextToken().toInt()) }
        return list
    }
}
