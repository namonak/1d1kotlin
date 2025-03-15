package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No17520Test : StringSpec({
    "Balanced String : https://www.acmicpc.net/problem/17520" {
        val testCases = listOf(
            "3" to "4",
            "22" to "2048",
            "101" to "393256"
        )

        testCases.forEach { (given, expected) ->
            No17520().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
