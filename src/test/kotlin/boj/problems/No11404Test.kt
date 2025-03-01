package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11404Test : StringSpec({
    "플로이드 : https://www.acmicpc.net/problem/11404" {
        val given = """
            5
            14
            1 2 2
            1 3 3
            1 4 1
            1 5 10
            2 4 2
            3 4 1
            3 5 1
            4 5 3
            3 5 10
            3 1 8
            1 4 2
            5 1 7
            3 4 2
            5 2 4
        """.trimIndent()
        val expected = """
            0 2 3 1 4
            12 0 15 2 5
            8 5 0 1 1
            10 7 13 0 3
            7 4 10 6 0
        """.trimIndent()

        No11404().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
