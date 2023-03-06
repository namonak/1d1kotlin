package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No9498Test : StringSpec({
    "시험 성적 테스트" {
        val testCases = listOf(
            row("100", "A"),
            row("90", "A"),
            row("89", "B"),
            row("80", "B"),
            row("79", "C"),
            row("70", "C"),
            row("69", "D"),
            row("60", "D"),
            row("59", "F"),
            row("0", "F")
        )

        testCases.forEach { (input, expected) ->
            // given
            val given = BufferedReader(StringReader(input))

            // when
            val actual = No9498.solve(given)

            // then
            actual shouldBe expected
        }
    }
})
