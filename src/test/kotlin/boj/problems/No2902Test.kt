package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2902Test : StringSpec({
    "KMP는 왜 KMP일까? : https://www.acmicpc.net/problem/2902" {
        val testCases = listOf(
            "Knuth-Morris-Pratt" to "KMP",
            "Mirko-Slavko" to "MS",
            "Pasko-Patak" to "PP",
            "Kuchiguse" to "K"
        )

        testCases.forEach { (given, expected) ->
            No2902().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
