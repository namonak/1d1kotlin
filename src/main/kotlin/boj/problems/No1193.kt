package boj.problems

import java.io.BufferedReader

class No1193 {
    fun solve(input: BufferedReader): String {
        val x = input.readLine().toInt()
        var crossCount = 1
        var prevCountSum = 0

        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (x <= prevCountSum + crossCount) {
                // 대각선의 개수가 홀수라면
                if (crossCount % 2 == 1) {
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    return (crossCount - (x - prevCountSum - 1)).toString() + "/" + (x - prevCountSum)
                }
                // 홀수일 때의 출력을 반대로
                return (x - prevCountSum).toString() + "/" + (crossCount - (x - prevCountSum - 1))
            }
            prevCountSum += crossCount
            crossCount++
        }
    }
}
