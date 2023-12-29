package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5543Test : StringSpec({
    "상근날드 : https://www.acmicpc.net/problem/5543" {
        val testCases = listOf(
            "800\n700\n900\n198\n330" to "848",
            "1999\n1999\n100\n189\n100" to "150"
        )

        testCases.forEach { (given, output) ->
            No5543.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
