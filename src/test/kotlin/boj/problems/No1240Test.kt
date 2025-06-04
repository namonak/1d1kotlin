package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1240Test : StringSpec({
    "노드사이의 거리 : https://www.acmicpc.net/problem/1240" {
        val given = """
            4 2
            2 1 2
            4 3 2
            1 4 3
            1 2
            3 2
        """.trimIndent()
        val expected = """
            2
            7
        """.trimIndent()

        val result = No1240().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
