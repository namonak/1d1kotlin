package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2630Test : StringSpec({
    "색종이 만들기 : https://www.acmicpc.net/problem/2630" {
        val given = """
            8
            1 1 0 0 0 0 1 1
            1 1 0 0 0 0 1 1
            0 0 0 0 1 1 0 0
            0 0 0 0 1 1 0 0
            1 0 0 0 1 1 1 1
            0 1 0 0 1 1 1 1
            0 0 1 1 1 1 1 1
            0 0 1 1 1 1 1 1
        """.trimIndent()
        val expected = """
            9
            7
        """.trimIndent()

        No2630().solve(given.reader().buffered()) shouldBe expected
    }
})
