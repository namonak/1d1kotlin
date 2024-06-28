package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2145Test : StringSpec({
    "숫자 놀이 : https://www.acmicpc.net/problem/2145" {
        val given = """
            673
            51
            1000
            99
            0
        """.trimIndent()
        val expected = """
            7
            6
            1
            9
        """.trimIndent()

        No2145().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
