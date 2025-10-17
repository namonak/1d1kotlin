package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2309Test : StringSpec({
    "일곱 난쟁이 : https://www.acmicpc.net/problem/2309" {
        val given = """
            20
            7
            23
            19
            10
            15
            25
            8
            13
        """.trimIndent()
        val expected = """
            7
            8
            10
            13
            19
            20
            23
        """.trimIndent()

        No2309().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
