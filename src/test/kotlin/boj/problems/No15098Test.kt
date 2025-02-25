package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15098Test : StringSpec({
    "No Duplicates : https://www.acmicpc.net/problem/15098" {
        val testCases = listOf(
            "THE RAIN IN SPAIN" to "yes",
            "IN THE RAIN AND THE SNOW" to "no",
            "THE RAIN IN SPAIN IN THE PLAIN" to "no"
        )

        testCases.forEach { (given, expected) ->
            No15098().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
