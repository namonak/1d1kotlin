package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2864Test : StringSpec({
    "5와 6의 차이 : https://www.acmicpc.net/problem/2864" {
        val testCases = listOf(
            "11 25" to "36 37",
            "1430 4862" to "6282 6292",
            "16796 58786" to "74580 85582",
        )

        testCases.forEach { (given, expected) ->
            No2864().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
