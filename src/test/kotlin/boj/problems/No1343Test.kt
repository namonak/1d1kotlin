package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1343Test : StringSpec({
    "폴리오미노 : https://www.acmicpc.net/problem/1343" {
        val testCases = listOf(
            "XXXXXX" to "AAAABB",
            "XX.XX" to "BB.BB",
            "XXXX....XXX.....XX" to "-1",
            "X" to "-1",
            "XX.XXXXXXXXXX..XXXXXXXX...XXXXXX" to "BB.AAAAAAAABB..AAAAAAAA...AAAABB"
        )

        testCases.forEach { (given, expected) ->
            No1343().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
