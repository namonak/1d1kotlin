package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2455Test : StringSpec({
    "지능형 기차 : https://www.acmicpc.net/problem/2455" {
        val given = """
            0 32
            3 13
            28 25
            39 0
        """.trimIndent()
        val expected = "42"

        No2455().solve(given.reader().buffered()) shouldBe expected
    }
})
