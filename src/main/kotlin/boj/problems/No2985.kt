package boj.problems

import java.io.BufferedReader

class No2985 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }

        return when {
            a + b == c -> "$a+$b=$c"
            a - b == c -> "$a-$b=$c"
            a * b == c -> "$a*$b=$c"
            a / b == c -> "$a/$b=$c"
            a == b + c -> "$a=$b+$c"
            a == b - c -> "$a=$b-$c"
            a == b * c -> "$a=$b*$c"
            a == b / c -> "$a=$b/$c"
            else -> throw IllegalArgumentException()
        }
    }
}
