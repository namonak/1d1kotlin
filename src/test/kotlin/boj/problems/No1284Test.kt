package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1284Test : StringSpec({
    "집 주소 : https://www.acmicpc.net/problem/1284" {
        val given = """
            120
            5611
            100
            0
        """.trimIndent()
        val expected = """
            13
            15
            14
        """.trimIndent()

        No1284().solve(given.reader().buffered()) shouldBe expected
    }
})
