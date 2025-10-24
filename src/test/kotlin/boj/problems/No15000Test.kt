package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15000Test : StringSpec({
    "CAPS : https://www.acmicpc.net/problem/15000" {
        val testCases = listOf(
            "alert" to "ALERT",
            "earthisunderattack" to "EARTHISUNDERATTACK",
            "canyoupickupsomegroceries" to "CANYOUPICKUPSOMEGROCERIES"
        )

        testCases.forEach { (given, expected) ->
            No15000().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
