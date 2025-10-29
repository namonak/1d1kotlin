package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1120Test : StringSpec({
    "문자열 : https://www.acmicpc.net/problem/1120" {
        val testCases = listOf(
            "adaabc aababbc" to "2",
            "hello xello" to "1",
            "koder topcoder" to "1",
            "abc topabcoder" to "0",
            "giorgi igroig" to "6"
        )

        testCases.forEach { (given, expected) ->
            No1120().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
