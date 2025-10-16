package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18406Test : StringSpec({
    "럭키 스트레이트 : https://www.acmicpc.net/problem/18406" {
        val testCases = listOf(
            "123402" to "LUCKY",
            "7755" to "READY"
        )

        testCases.forEach { (given, output) ->
            No18406().solve(BufferedReader(given.reader())) shouldBe output
        }
    }
})
