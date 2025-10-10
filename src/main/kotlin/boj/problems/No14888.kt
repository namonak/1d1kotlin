package boj.problems

import java.io.BufferedReader

class No14888 {
    private var maxResult = Int.MIN_VALUE
    private var minResult = Int.MAX_VALUE

    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val ops = input.readLine().split(" ").map { it.toInt() }
        val (cntPlus, cntMinus, cntMul, cntDiv) = ops

        // 초기값 설정
        maxResult = Int.MIN_VALUE
        minResult = Int.MAX_VALUE

        // dfs 호출
        dfs(1, numbers[0], numbers, cntPlus, cntMinus, cntMul, cntDiv)

        return "$maxResult\n$minResult"
    }

    private fun dfs(
        index: Int,
        cur: Int,
        numbers: List<Int>,
        plus: Int,
        minus: Int,
        mul: Int,
        div: Int
    ) {
        if (index == numbers.size) {
            maxResult = maxOf(maxResult, cur)
            minResult = minOf(minResult, cur)
            return
        }
        val next = numbers[index]
        if (plus > 0) dfs(index + 1, cur + next, numbers, plus - 1, minus, mul, div)
        if (minus > 0) dfs(index + 1, cur - next, numbers, plus, minus - 1, mul, div)
        if (mul > 0) dfs(index + 1, cur * next, numbers, plus, minus, mul - 1, div)
        if (div > 0) {
            val result = if (cur < 0) -((-cur) / next) else cur / next
            dfs(index + 1, result, numbers, plus, minus, mul, div - 1)
        }
    }
}
