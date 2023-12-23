package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10769Test : StringSpec({
    "행복한지 슬픈지 : https://www.acmicpc.net/problem/10769" {
        val testCases = listOf(
            "How are you :-) doing :-( today :-)?" to "happy",
            ":)" to "none",
            "This:-(is str:-(:-(ange te:-)xt." to "sad",
            ":-):-):-(:-(" to "unsure"
        )

        testCases.forEach { (given, output) ->
            No10769.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
