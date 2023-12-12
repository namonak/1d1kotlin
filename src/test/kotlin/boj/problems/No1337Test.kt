package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1337Test : StringSpec({
    "올바른 배열 : https://www.acmicpc.net/problem/1337" {
        val testCases = listOf(
            "3\n5\n6\n7" to "2",
            "6\n5\n7\n9\n8492\n8493\n192398" to "2",
            "4\n1000\n2000\n3000\n4000" to "4",
            "7\n6\n1\n9\n5\n7\n15\n8" to "0"
        )

        testCases.forEach { (given, output) ->
            No1337.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
