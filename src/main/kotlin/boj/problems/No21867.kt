package boj.problems

import java.io.BufferedReader

object No21867 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val s = input.readLine()
        return s.filterNot { it == 'J' || it == 'A' || it == 'V' }.let {
            it.ifEmpty { "nojava" }
        }
    }
}
