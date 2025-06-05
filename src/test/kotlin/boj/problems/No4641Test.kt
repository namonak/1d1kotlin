package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4641Test : StringSpec({
    "Doubles : https://www.acmicpc.net/problem/4641" {
        val givne = """
            1 4 3 2 9 7 18 22 0
            2 4 8 10 0
            7 5 11 13 1 3 0
            -1
        """.trimIndent()
        val expected = """
            3
            2
            0
        """.trimIndent()

        val result = No4641().solve(BufferedReader(givne.reader()))
        result shouldBe expected
    }
})
