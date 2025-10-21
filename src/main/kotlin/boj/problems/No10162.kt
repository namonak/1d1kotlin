package boj.problems

import java.io.BufferedReader

private const val A_SECONDS = 5 * 60
private const val B_SECONDS = 60
private const val C_SECONDS = 10
private const val TIME_UNIT = 10

class No10162 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()

        // 어떤 조합으로도 만들 수 없는 경우: 10초 단위가 아니면 불가
        if (t % TIME_UNIT != 0) return "-1"

        var remain = t
        val aCount = remain / A_SECONDS
        remain %= A_SECONDS

        val bCount = remain / B_SECONDS
        remain %= B_SECONDS

        val cCount = remain / C_SECONDS

        return "$aCount $bCount $cCount"
    }
}
