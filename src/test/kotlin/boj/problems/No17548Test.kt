package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17548Test : StringSpec({
    "Greetings! : https://www.acmicpc.net/problem/17548" {
        val testCases = listOf(
            "hey" to "heey",
            "heeeeey" to "heeeeeeeeeey"
        )

        testCases.forEach { (given, expected) ->
            No17548().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
