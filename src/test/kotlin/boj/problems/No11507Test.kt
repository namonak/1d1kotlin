package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11507Test : StringSpec({
    "카드셋트 : https://www.acmicpc.net/problem/11507" {
        val testCases = listOf(
            "P01K02H03H04" to "12 12 11 13",
            "H02H10P11H02" to "GRESKA",
            "P10K10H10T01" to "12 12 12 12"
        )

        testCases.forEach { (given, expected) ->
            No11507().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
