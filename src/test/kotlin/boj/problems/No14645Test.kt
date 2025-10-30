package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14645Test : StringSpec({
    "와이버스 부릉부릉 : https://www.acmicpc.net/problem/14645" {
        val given = """
            3 2
            10 3
            21 8
            0 15
        """.trimIndent()
        val expected = "비와이"

        No14645().solve(given.reader().buffered()) shouldBe expected
    }
})
