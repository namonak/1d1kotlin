package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25870Test : StringSpec({
    "Parity of Strings : https://www.acmicpc.net/problem/25870" {
        val testCases = listOf(
            "coachessoaehwwwwww" to "0",
            "coachesarefun" to "2",
            "coachesc" to "1"
        )

        for ((given, expected) in testCases) {
            No25870().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
