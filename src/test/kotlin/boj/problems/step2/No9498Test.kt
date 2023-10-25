package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9498Test : StringSpec({
    "시험 성적 테스트" {
        val testCases = listOf(
            "100" to "A",
            "90" to "A",
            "89" to "B",
            "80" to "B",
            "79" to "C",
            "70" to "C",
            "69" to "D",
            "60" to "D",
            "59" to "F",
            "0" to "F"
        )

        testCases.forEach { (given, expected) ->
            No9498.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
