package boj.problems

import java.io.BufferedReader

class No28691 {
    fun solve(input: BufferedReader): String {
        val ch = input.readLine().first()

        return when (ch) {
            'M' -> "MatKor"
            'W' -> "WiCys"
            'C' -> "CyKor"
            'A' -> "AlKor"
            else -> "\$clear"
        }
    }
}
