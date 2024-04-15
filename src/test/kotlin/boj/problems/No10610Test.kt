package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10610Test : StringSpec({
    "30 : https://www.acmicpc.net/problem/10610" {
        val testCases = listOf(
            "30" to "30",
            "102" to "210",
            "2931" to "-1",
            "80875542" to "88755420"
        )

        testCases.forEach { (given, expected) ->
            No10610().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
