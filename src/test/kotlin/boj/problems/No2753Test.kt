package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2753Test : StringSpec({
    "윤년 테스트" {
        val testCases = listOf(
            "2000" to "1",
            "1999" to "0",
            "1900" to "0"
        )

        testCases.forEach { (given, expected) ->
            No2753().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
