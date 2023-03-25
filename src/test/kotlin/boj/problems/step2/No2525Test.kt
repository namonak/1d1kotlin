package boj.problems.step2

import boj.problems.step2.No2525.solve
import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import org.assertj.core.api.Assertions.assertThat
import java.io.BufferedReader
import java.io.StringReader

class No2525Test : StringSpec({
    "오븐 시계 테스트" {
        val testCases = listOf(
            row("14 30\n20", "14 50"),
            row("17 40\n80", "19 0"),
            row("23 48\n25", "0 13")
        )

        testCases.forEach { (input, expected) ->
            // given
            val given = BufferedReader(StringReader(input))

            // when
            val actual = solve(given)

            // then
            assertThat(actual).isEqualTo(expected)
        }
    }
})
