package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2753Test : StringSpec({
    "윤년 테스트" {
        val testCases = listOf(
            row("2000", 1),
            row("1999", 0),
            row("1900", 0)
        )

        testCases.forEach { (input, expected) ->
            // given
            val given = BufferedReader(StringReader(input))

            // when
            val actual = No2753.solve(given)

            // then
            actual shouldBe expected
        }
    }
})
