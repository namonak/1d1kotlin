package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1152Test : StringSpec({
    "단어의 개수 : https://www.acmicpc.net/problem/1152" {
        val testCases = listOf(
            "The Curious Case of Benjamin Button" to "6",
            "The first character is a blank" to "6",
            "The last character is a blank " to "6",
            "Mazatneunde Wae Teullyeoyo" to "3",
            "Teullinika Teullyeotzi" to "2"
        )

        testCases.forEach { (given, expected) ->
            No1152().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
