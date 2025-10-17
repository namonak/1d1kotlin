package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9375Test : StringSpec({
    "패션왕 신해빈 : https://www.acmicpc.net/problem/9375" {
        val given = """
            2
            3
            hat headgear
            sunglasses eyewear
            turban headgear
            3
            mask face
            sunglasses face
            makeup face
        """.trimIndent()
        val expected = """
            5
            3
        """.trimIndent()

        No9375().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
