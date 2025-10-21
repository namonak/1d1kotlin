package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5598Test : StringSpec({
    "카이사르 암호 : https://www.acmicpc.net/problem/5598" {
        val testCases = listOf(
            "MRL" to "JOI",
            "FURDWLD" to "CROATIA"
        )

        testCases.forEach { (given, output) ->
            No5598().solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
