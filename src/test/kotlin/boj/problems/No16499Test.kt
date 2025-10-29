package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16499Test : StringSpec({
    "동일한 단어 그룹화하기 : https://www.acmicpc.net/problem/16499" {
        val testCases = listOf(
            """
                4
                cat
                dog
                god
                tca
            """.trimIndent() to "2",
            """
                2
                a
                a
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No16499().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
