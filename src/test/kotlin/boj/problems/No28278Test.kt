package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28278Test : StringSpec({
    "스택 2 : https://www.acmicpc.net/problem/28278" {
        val given = """
            9
            4
            1 3
            1 5
            3
            2
            5
            2
            2
            5
        """.trimIndent()
        val expected = """
            1
            2
            5
            3
            3
            -1
            -1
        """.trimIndent()

        No28278().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
