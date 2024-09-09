package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25418Test : StringSpec({
    "정수 a를 k로 만들기 : https://www.acmicpc.net/problem/25418" {
        val testCases = listOf(
            "5 10" to "1",
            "7 77" to "7",
            "1111 997651" to "850"
        )

        testCases.forEach { (given, expected) ->
            No25418().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
