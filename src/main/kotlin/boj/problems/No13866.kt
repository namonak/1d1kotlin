package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No13866 {
    fun solve(input: BufferedReader): String {
        val skill = input.readLine().split(" ").map { it.toInt() }.sorted()
        return abs((skill[0] + skill[3]) - (skill[1] + skill[2])).toString()
    }
}
