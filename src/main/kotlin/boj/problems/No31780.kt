package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No31780 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())

        val x = st.nextToken().toLong()
        val m = st.nextToken().toLong()

        // 수학적 불변성을 이용한 O(1) 연산 수행
        // m에 1을 더하는 과정에서도 명시적으로 Long 타입 리터럴(1L)을 사용하여 안전성 강화
        val totalMagicPower = x * (m + 1L)

        return totalMagicPower.toString()
    }
}
