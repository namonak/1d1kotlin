package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26509Test : StringSpec({
    "Triangle : https://www.acmicpc.net/problem/26509" {
        val given = """
            3
            3 4 5
            4 3 5
            3 4 6
            4 6 3
            39 52 65
            25 60 65
        """.trimIndent()
        val expected = """
            YES
            NO
            NO
        """.trimIndent()

        No26509().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
