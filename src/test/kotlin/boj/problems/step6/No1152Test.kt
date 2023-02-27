package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

internal class No1152Test : StringSpec({
    "단어의 개수 테스트" {
        val (input, expected) = row(
            "The Curious Case of Benjamin Button", "6",
            "The first character is a blank", "6",
            "The last character is a blank", "6",
            "Mazatneunde Wae Teullyeoyo", "3",
            "Teullinika Teullyeotzi", "2"
        )

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual: String = No1152.solve(given).toString()

        // then
        actual shouldBe expected
    }
})
