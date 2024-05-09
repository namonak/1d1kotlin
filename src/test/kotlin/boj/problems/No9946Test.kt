package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9946Test : StringSpec({
    "단어 퍼즐 : https://www.acmicpc.net/problem/9946" {
        val given = """
            testing
            intestg
            abc
            aabbbcccc
            abcabcbcc
            aabbbcccc
            abc
            xyz
            END
            END
        """.trimIndent()
        val expected = """
            Case 1: same
            Case 2: different
            Case 3: same
            Case 4: different
        """.trimIndent()

        No9946().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
