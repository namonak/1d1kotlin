package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No2884Test : StringSpec({
    "알람 시계 테스트" {
        val testCases = listOf(
            row("10 10", "9 25"),
            row("0 30", "23 45"),
            row("23 40", "22 55")
        )

        testCases.forEach { (input, expected) ->
            // given
            val no2884 = No2884(InputProcessor(), OutputProcessor())

            // when
            val actual = no2884.solve(input)

            // then
            actual shouldBe expected
        }
    }
})
