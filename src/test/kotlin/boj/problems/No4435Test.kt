package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4435Test : StringSpec({
    "중간계 전쟁 : https://www.acmicpc.net/problem/4435" {
        val given = """
            3
            1 1 1 1 1 1
            1 1 1 1 1 1 1
            0 0 0 0 0 10
            0 1 1 1 1 0 0
            1 0 0 0 0 0
            1 0 0 0 0 0 0
        """.trimIndent()
        val expected = """
            Battle 1: Evil eradicates all trace of Good
            Battle 2: Good triumphs over Evil
            Battle 3: No victor on this battle field
        """.trimIndent()

        No4435().solve(given.reader().buffered()) shouldBe expected
    }
})
