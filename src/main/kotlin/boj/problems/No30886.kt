package boj.problems

import java.io.BufferedReader
import java.util.Locale
import kotlin.math.PI
import kotlin.math.sqrt

class No30886 {
    fun solve(input: BufferedReader): String {
        // 원 면적 a
        val a = input.readLine().toDouble()

        // 1) 반지름 r = sqrt(a / π)
        // 2) 한 변의 길이 side = 2 * (r + 1)
        //    → = 2 * ( sqrt(a/π) + 1 )
        // 3) 사각형 면적 = side^2
        //    → (2 * ( √(a/π) + 1 ))^2
        //    → 4 * ( √(a/π) + 1 )^2

        val term = sqrt(a / PI) + 1 // (√(a/π) + 1)
        val area = 4 * term * term // 4 * (√(a/π) + 1)^2

        // 소수점 이하 10자리까지 포맷 (절대/상대 오차 1e-9 요구사항 만족)
        return String.format(Locale.US, "%.10f", area)
    }
}
