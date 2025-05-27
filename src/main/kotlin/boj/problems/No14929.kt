package boj.problems

import java.io.BufferedReader

class No14929 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        // xi는 절댓값 100 이하 → Int 범위지만, 곱과 합이 커지므로 Long으로 처리
        val nums = input.readLine().split(" ").map { it.toLong() }

        // 1) 전체 합을 구해두고
        var remaining = nums.sum() // R = x1 + x2 + ... + xn
        var answer = 0L

        // 2) 사후 합 방식으로 한 번 순회
        for (x in nums) {
            remaining -= x // R = sum of elements after x
            answer += x * remaining // x * (x 다음부터의 합)
        }

        return answer.toString()
    }
}
