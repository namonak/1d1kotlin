package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2896 {
    data class Juices(val orange: Double, val apple: Double, val pineapple: Double)

    fun solve(input: BufferedReader): String {
        val purchased = parseJuices(input.readLine())
        val ratio = parseJuices(input.readLine())

        // 칵테일을 만들 수 있는 비율 중 가장 작은 값을 찾음
        val minRatio = minOf(
            purchased.orange / ratio.orange,
            purchased.apple / ratio.apple,
            purchased.pineapple / ratio.pineapple
        )

        // 남은 양 계산 및 결과 생성
        return listOf(
            purchased.orange - (ratio.orange * minRatio),
            purchased.apple - (ratio.apple * minRatio),
            purchased.pineapple - (ratio.pineapple * minRatio)
        ).joinToString(" ") { "%.6f".format(it).trimEnd('0').trimEnd('.') }
    }

    private fun parseJuices(line: String?): Juices {
        val st = StringTokenizer(line ?: "")
        return Juices(
            st.nextToken().toDouble(),
            st.nextToken().toDouble(),
            st.nextToken().toDouble()
        )
    }
}
