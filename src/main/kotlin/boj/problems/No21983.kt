package boj.problems

import java.io.BufferedReader
import java.util.Locale
import kotlin.math.sqrt

class No21983 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toDouble()

        // Perimeter P = 6 * sqrt( 2A / (3 * sqrt(3)) )
        val perimeter = 6.0 * sqrt(2.0 * a / (3.0 * sqrt(3.0)))

        // 절대/상대 오차 1e-6 만족: 넉넉하게 10자리 소수 출력
        return String.format(Locale.US, "%.10f", perimeter)
    }
}
