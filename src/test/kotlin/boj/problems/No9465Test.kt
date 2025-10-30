package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9465Test : StringSpec({
    "스티커 : https://www.acmicpc.net/problem/9465" {
        val given = """
            2
            5
            50 10 100 20 40
            30 50 70 10 60
            7
            10 30 10 50 100 20 40
            20 40 30 50 60 20 80
        """.trimIndent()
        val expected = """
            260
            290
        """.trimIndent()

        No9465().solve(given.reader().buffered()) shouldBe expected
    }
})
