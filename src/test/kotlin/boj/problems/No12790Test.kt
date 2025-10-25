package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12790Test : StringSpec({
    "Mini Fantasy War : https://www.acmicpc.net/problem/12790" {
        val given = """
            3
            100 100 100 100 0 0 0 0
            10 20 30 40 40 30 20 10
            100 100 100 100 -200 0 400 400
        """.trimIndent()
        val expected = """
            1000
            500
            2501
        """.trimIndent()

        No12790().solve(given.reader().buffered()) shouldBe expected
    }
})
