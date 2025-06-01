package boj.problems

import java.io.BufferedReader

class No21967 {
    fun solve(input: BufferedReader): String {
        val N = input.readLine().toInt()
        val A = input.readLine().split(" ").map { it.toInt() }
        val freq = IntArray(11) { 0 }
        var L = 0
        var ans = 0

        for (R in 0 until N) {
            freq[A[R]]++

            while (true) {
                // 현재 윈도우 [L..R]의 최소값 찾기
                var mn = 1
                while (mn <= 10 && freq[mn] == 0) {
                    mn++
                }
                // 현재 윈도우 [L..R]의 최대값 찾기
                var mx = 10
                while (mx >= 1 && freq[mx] == 0) {
                    mx--
                }
                // 반석 조건을 벗어나면 L을 한 칸 옮김
                if (mx - mn <= 2) {
                    break
                }
                freq[A[L]]--
                L++
            }

            ans = maxOf(ans, R - L + 1)
        }

        return ans.toString()
    }
}
