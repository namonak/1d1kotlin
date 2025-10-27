package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1735Test : StringSpec({
    "분수 합 : https://www.acmicpc.net/problem/1735" {
        val given = """
            2 7
            3 5
        """.trimIndent()
        val expected = "31 35"

        No1735().solve(given.reader().buffered()) shouldBe expected
    }
})
