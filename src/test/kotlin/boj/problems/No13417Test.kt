package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13417Test : StringSpec({
    "카드 문자열 : https://www.acmicpc.net/problem/13417" {
        val given = """
            3
            3
            M K U
            5
            A S D F G
            7
            B A C A B A C
        """.trimIndent()
        val expected = """
            KMU
            ASDFG
            AAABCBC
        """.trimIndent()

        No13417().solve(given.reader().buffered()) shouldBe expected
    }
})
