package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No24855 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.toInt() ?: return "0"
        val treasures = parseTreasures(input.readLine(), n)

        // 가치가 높은 보물을 최대한 많이 남기기 위해 내림차순 정렬
        treasures.sortDescending()

        // 선장이 가질 수 있는 보물의 개수: n - ceil(n / 2.0) = floor(n / 2.0)
        val keepCount = n / 2

        val maxRemainingValue = treasures.take(keepCount).sum()

        return maxRemainingValue.toString()
    }

    private fun parseTreasures(
        line: String?,
        n: Int
    ): IntArray {
        val st = StringTokenizer(line ?: "")
        return IntArray(n) { st.nextToken().toInt() }
    }
}
