package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1072Test : StringSpec({
    "게임 : https://www.acmicpc.net/problem/1072" {
        val testCases = listOf(
            "10 8" to "1",
            "100 80" to "6",
            "47 47" to "-1",
            "99000 0" to "1000",
            "1000000000 470000000" to "19230770"
        )

        testCases.forEach { (given, expected) ->
            No1072().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
