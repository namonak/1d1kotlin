package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15688Test : StringSpec({
    "수 정렬하기 5 : https://www.acmicpc.net/problem/15688" {
        val testCases = listOf(
            "5\n5\n4\n3\n2\n1" to "1\n2\n3\n4\n5",
            "5\n1\n2\n1\n2\n1" to "1\n1\n1\n2\n2",
            "5\n1\n2\n3\n4\n5" to "1\n2\n3\n4\n5",
            "6\n0\n0\n0\n0\n0\n0" to "0\n0\n0\n0\n0\n0"
        )

        testCases.forEach { (input, output) ->
            No15688.solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
