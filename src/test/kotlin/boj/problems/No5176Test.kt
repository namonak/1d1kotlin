package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5176Test : StringSpec({
    "대회 자리 : https://www.acmicpc.net/problem/5176" {
        val given = """
            3
            4 1
            1
            1
            1
            1
            4 4
            1
            2
            3
            4
            4 4
            1
            4
            1
            4
        """.trimIndent()
        val expected = """
            3
            0
            2
        """.trimIndent()

        No5176().solve(given.reader().buffered()) shouldBe expected
    }
})
