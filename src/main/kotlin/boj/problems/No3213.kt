package boj.problems

import java.io.BufferedReader

class No3213 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var quarter = 0
        var half = 0
        var threeQuarter = 0

        repeat(n) {
            when (input.readLine()) {
                "1/4" -> quarter++
                "1/2" -> half++
                "3/4" -> threeQuarter++
            }
        }

        // 피자 최소 판 수 계산
        var pizzas = 0

        // 3/4와 1/4 매칭
        val match = minOf(threeQuarter, quarter)
        pizzas += match
        threeQuarter -= match
        quarter -= match

        // 남은 3/4 처리 (한 명당 피자 한 판씩)
        pizzas += threeQuarter

        // 1/2 처리 (두 명씩 한 판씩)
        pizzas += half / 2
        half %= 2

        // 남은 1/2가 있는 경우
        if (half > 0) {
            pizzas += 1
            quarter -= minOf(2, quarter)
        }

        pizzas += quarter / 4
        if (quarter % 4 > 0) {
            pizzas += 1
        }

        return pizzas.toString()
    }
}
