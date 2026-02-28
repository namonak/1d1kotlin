package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30805Test : StringSpec({
    "사전 순 최대 공통 부분 수열 : https://www.acmicpc.net/problem/30805" {
        val given = """
            4
            1 9 7 3
            5
            1 8 7 5 3
        """.trimIndent()
        val expected = """
            2
            7 3
        """.trimIndent()

        No30805().solve(given.reader().buffered()) shouldBe expected
    }
})
