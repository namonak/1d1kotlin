package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2535Test : StringSpec({
    "아시아 정보올림피아드 : https://www.acmicpc.net/problem/2535" {
        val given = """
            9
            1 1 230
            1 2 210
            1 3 205
            2 1 100
            2 2 150
            3 1 175
            3 2 190
            3 3 180
            3 4 195
        """.trimIndent()
        val expected = """
            1 1
            1 2
            3 4
        """.trimIndent()

        No2535().solve(given.reader().buffered()) shouldBe expected
    }
})
