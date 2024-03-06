package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2579Test : StringSpec({
    "계단 오르기 : https://www.acmicpc.net/problem/2579" {
        val given = """
            6
            10
            20
            15
            25
            10
            20
        """.trimIndent()
        val expected = "75"

        No2579().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
