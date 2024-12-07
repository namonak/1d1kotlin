package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10420Test : StringSpec({
    "기념일 1 : https://www.acmicpc.net/problem/10420" {
        val testCases = listOf(
            "200" to "2014-10-18",
            "1" to "2014-04-02"
        )

        testCases.forEach { (given, expected) ->
            No10420().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
