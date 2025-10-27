package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4134Test : StringSpec({
    "다음 소수 : https://www.acmicpc.net/problem/4134" {
        val given = """
            3
            6
            20
            100
        """.trimIndent()
        val expected = """
            7
            23
            101
        """.trimIndent()

        No4134().solve(given.reader().buffered()) shouldBe expected
    }
})
