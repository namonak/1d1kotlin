package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1245Test : StringSpec({
    "농장 관리 : https://www.acmicpc.net/problem/1245" {
        val given = """
            8 7
            4 3 2 2 1 0 1
            3 3 3 2 1 0 1
            2 2 2 2 1 0 0
            2 1 1 1 1 0 0
            1 1 0 0 0 1 0
            0 0 0 1 1 1 0
            0 1 2 2 1 1 0
            0 1 1 1 2 1 0
        """.trimIndent()
        val expected = "3"

        No1245().solve(given.reader().buffered()) shouldBe expected
    }
})
