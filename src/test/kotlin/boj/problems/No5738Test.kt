package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5738Test : StringSpec({
    "He is offside! : https://www.acmicpc.net/problem/5738" {
        val given = """
            2 3
            500 700
            700 500 500
            2 2
            200 400
            200 1000
            3 4
            530 510 490
            480 470 50 310
            0 0
        """.trimIndent()
        val expected = """
            N
            Y
            N
        """.trimIndent()

        No5738().solve(given.reader().buffered()) shouldBe expected
    }
})
