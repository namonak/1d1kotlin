package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11726Test : StringSpec({
    "2×n 타일링 : https://www.acmicpc.net/problem/11726" {
        val testCases = listOf(
            "2" to "2",
            "9" to "55"
        )

        testCases.forEach { (given, output) ->
            No11726.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
