package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2156Test : StringSpec({
    "포도주 시식 : https://www.acmicpc.net/problem/2156" {
        val given = """
            6
            6
            10
            13
            9
            8
            1
        """.trimIndent()
        val expected = "33"

        No2156.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
