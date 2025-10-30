package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10178Test : StringSpec({
    "할로윈의 사탕 : https://www.acmicpc.net/problem/10178" {
        val given = """
            5
            22 3
            15 5
            99 8
            7 4
            101 5
        """.trimIndent()
        val expected = """
            You get 7 piece(s) and your dad gets 1 piece(s).
            You get 3 piece(s) and your dad gets 0 piece(s).
            You get 12 piece(s) and your dad gets 3 piece(s).
            You get 1 piece(s) and your dad gets 3 piece(s).
            You get 20 piece(s) and your dad gets 1 piece(s).
        """.trimIndent()

        val result = No10178().solve(given.reader().buffered())
        result shouldBe expected
    }
})
