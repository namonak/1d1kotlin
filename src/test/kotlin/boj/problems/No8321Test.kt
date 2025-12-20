package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8321Test : StringSpec({
    "Tables : https://www.acmicpc.net/problem/8321" {
        val given = """
            5 6 3
            3 9 5 7 3
        """.trimIndent()
        val expected = "3"

        No8321().solve(given.reader().buffered()) shouldBe expected
    }
})
