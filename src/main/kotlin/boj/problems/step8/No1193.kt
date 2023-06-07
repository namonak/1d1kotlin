package boj.problems.step8

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1193.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No1193 {
    fun solve(input: Int): String {
        var crossCount = 1
        var prevCountSum = 0

        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (input <= prevCountSum + crossCount) {
                // 대각선의 개수가 홀수라면
                if (crossCount % 2 == 1) {
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    return (crossCount - (input - prevCountSum - 1)).toString() + "/" + (input - prevCountSum)
                }
                // 홀수일 때의 출력을 반대로
                return (input - prevCountSum).toString() + "/" + (crossCount - (input - prevCountSum - 1))
            }
            prevCountSum += crossCount
            crossCount++
        }
    }
}
