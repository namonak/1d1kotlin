package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14501Test : StringSpec({
    "퇴사 : https://www.acmicpc.net/problem/14501" {
        val testCases = listOf(
            "7\n3 10\n5 20\n1 10\n1 20\n2 15\n4 40\n2 200" to "45",
            "10\n1 1\n1 2\n1 3\n1 4\n1 5\n1 6\n1 7\n1 8\n1 9\n1 10" to "55",
            "10\n5 10\n5 9\n5 8\n5 7\n5 6\n5 10\n5 9\n5 8\n5 7\n5 6" to "20",
            "10\n5 50\n4 40\n3 30\n2 20\n1 10\n1 10\n2 20\n3 30\n4 40\n5 50" to "90"
        )

        testCases.forEach { (given, expected) ->
            No14501().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
