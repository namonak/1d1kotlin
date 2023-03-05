package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1152Test : StringSpec({
    "단어의 개수 테스트" {
        val testCases = listOf(
            row("The Curious Case of Benjamin Button", 6),
            row("The first character is a blank", 6),
            row("The last character is a blank", 6),
            row("Mazatneunde Wae Teullyeoyo", 3),
            row("Teullinika Teullyeotzi", 2)
        )

        testCases.forEach { (input, expected) ->
            // given
            val given = BufferedReader(StringReader(input))

            // when
            val actual = No1152.solve(given)

            // then
            actual shouldBe expected
        }
    }
})
