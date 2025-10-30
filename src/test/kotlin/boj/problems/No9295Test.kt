package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9295Test : StringSpec({
    "주사위 : https://www.acmicpc.net/problem/9295" {
        val given = """
            5
            1 2
            1 3
            3 5
            2 6
            3 4
        """.trimIndent()
        val expected = """
            Case 1: 3
            Case 2: 4
            Case 3: 8
            Case 4: 8
            Case 5: 7
        """.trimIndent()

        val actual = No9295().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
