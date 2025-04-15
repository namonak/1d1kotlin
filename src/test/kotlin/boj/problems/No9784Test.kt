package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9784Test : StringSpec({
    "Boiled Eggs : https://www.acmicpc.net/problem/9784" {
        val given = """
            3
            3 2 10
            1 3 2
            4 5 5
            4 4 5 5
            5 5 15
            2 5 5 5 9
        """.trimIndent()
        val expected = """
            Case 1: 2
            Case 2: 1
            Case 3: 3
        """.trimIndent()

        No9784().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
