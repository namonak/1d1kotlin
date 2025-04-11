package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9329Test : StringSpec({
    "패스트 푸드 상금 : https://www.acmicpc.net/problem/9329" {
        val given = """
            3
            2 10
            3 1 2 3 100
            4 4 5 6 7 200
            2 3 1 4 5 2 2 1 3 4
            3 6
            2 1 2 100
            3 3 4 5 200
            1 6 300
            1 2 3 4 5 6
            3 6
            2 1 2 100
            3 3 4 5 200
            1 6 300
            1 2 0 4 5 6
        """.trimIndent()
        val expected = """
            500
            2500
            1900
        """.trimIndent()

        No9329().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
