package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11286Test : StringSpec({
    "절댓값 힙 : https://www.acmicpc.net/problem/11286" {
        val given = """
            18
            1
            -1
            0
            0
            0
            1
            1
            -1
            -1
            2
            -2
            0
            0
            0
            0
            0
            0
            0
        """.trimIndent()
        val expected = """
            -1
            1
            0
            -1
            -1
            1
            1
            -2
            2
            0
        """.trimIndent()

        No11286().solve(given.reader().buffered()) shouldBe expected
    }
})
