package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10434Test : StringSpec({
    "행복한 소수 : https://www.acmicpc.net/problem/10434" {
        val given = """
            4
            1 1
            2 7
            3 383
            4 1000
        """.trimIndent()
        val expected = """
            1 1 NO
            2 7 YES
            3 383 YES
            4 1000 NO
        """.trimIndent()

        No10434().solve(given.reader().buffered()) shouldBe expected
    }
})
