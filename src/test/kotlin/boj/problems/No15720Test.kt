package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15720Test : StringSpec({
    "카우버거 : https://www.acmicpc.net/problem/15720" {
        val given = """
            3 3 2
            2000 3000 2500
            800 1300 1000
            500 1000
        """.trimIndent()
        val expected = """
            12100
            11170
        """.trimIndent()

        No15720().solve(given.reader().buffered()) shouldBe expected
    }
})
