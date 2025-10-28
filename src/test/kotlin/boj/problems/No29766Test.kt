package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29766Test : StringSpec({
    "DKSH 찾기 : https://www.acmicpc.net/problem/29766" {
        val testCases = listOf(
            "DKKSSH" to "0",
            "HDKSHDDKS" to "1",
            "SDKSHSSDKSHS" to "2"
        )

        testCases.forEach { (given, expected) ->
            No29766().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
