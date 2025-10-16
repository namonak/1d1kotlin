package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28279Test : StringSpec({
    "덱 2 : https://www.acmicpc.net/problem/28279" {
        val given = """
            11
            6
            1 3
            1 8
            7
            8
            3
            2 5
            1 2
            5
            4
            4
        """.trimIndent()
        val expected = """
            1
            8
            3
            8
            3
            5
            3
        """.trimIndent()

        No28279().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
