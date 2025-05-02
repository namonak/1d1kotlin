package boj.problems

import java.io.BufferedReader

class No15686 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val houses = mutableListOf<Pair<Int, Int>>()
        val chickens = mutableListOf<Pair<Int, Int>>()

        repeat(n) { r ->
            input.readLine().split(" ").map { it.toInt() }.forEachIndexed { c, v ->
                when (v) {
                    1 -> houses.add(r to c)
                    2 -> chickens.add(r to c)
                }
            }
        }

        var answer = Int.MAX_VALUE
        val selected = mutableListOf<Pair<Int, Int>>()

        fun dfs(idx: Int) {
            if (selected.size == m) {
                var sum = 0
                for ((hr, hc) in houses) {
                    var dist = Int.MAX_VALUE
                    for ((cr, cc) in selected) {
                        val d = kotlin.math.abs(hr - cr) + kotlin.math.abs(hc - cc)
                        if (d < dist) dist = d
                    }
                    sum += dist
                }
                answer = minOf(answer, sum)
                return
            }
            if (idx == chickens.size) return

            // 선택
            selected.add(chickens[idx])
            dfs(idx + 1)
            selected.removeAt(selected.lastIndex)

            // 미선택
            dfs(idx + 1)
        }

        dfs(0)
        return answer.toString()
    }
}
