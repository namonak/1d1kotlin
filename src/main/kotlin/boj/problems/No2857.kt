package boj.problems

import java.io.BufferedReader

object No2857 {
    fun solve(input: BufferedReader): String {
        val result = mutableListOf<Int>()
        input.lineSequence().forEachIndexed { index, line ->
            if (line.contains("FBI")) result.add(index + 1)
        }
        return if (result.isEmpty()) "HE GOT AWAY!" else result.joinToString(" ")
    }
}
