package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20499Test : StringSpec({
    "Darius님 한타 안 함? : https://www.acmicpc.net/problem/20499" {
        val testCases = listOf(
            "0/5/3" to "hasu",
            "12/4/5" to "gosu",
            "0/0/10" to "hasu"
        )

        testCases.forEach { (given, expected) ->
            No20499().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
