package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15650.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No15650 {
    fun solve(input: String): String {
        val (n, m) = input.split(" ").map { it.toInt() }
        val visited = BooleanArray(n + 1) { false }
        val result = StringBuilder()
        dfs(0, 1, n, m, visited, result)
        return result.toString().trimEnd()
    }

    private fun dfs(depth: Int, start: Int, n: Int, m: Int, visited: BooleanArray, result: StringBuilder) {
        if (depth == m) {
            var count = 0
            for (i in 1..n) {
                if (visited[i]) {
                    result.append(i)
                    count++
                    if (count < m) result.append(" ") // 마지막 원소가 아닌 경우에만 공백 추가
                }
            }
            result.append("\n")
            return
        }

        for (i in start..n) {
            if (!visited[i]) {
                visited[i] = true
                dfs(depth + 1, i + 1, n, m, visited, result)
                visited[i] = false
            }
        }
    }
}
