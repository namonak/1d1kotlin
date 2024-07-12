package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5656Test : StringSpec({
    "비교 연산자 : https://www.acmicpc.net/problem/5656" {
        val given = """
            3 > 3
            4 > 3
            3 >= 3
            4 >= 3
            3 < 3
            4 < 3
            3 <= 3
            4 <= 3
            3 == 3
            3 == 4
            3 != 3
            3 != 4
            3 E 3
        """.trimIndent()
        val expected = """
            Case 1: false
            Case 2: true
            Case 3: true
            Case 4: true
            Case 5: false
            Case 6: false
            Case 7: true
            Case 8: false
            Case 9: true
            Case 10: false
            Case 11: false
            Case 12: true
        """.trimIndent()

        No5656().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
