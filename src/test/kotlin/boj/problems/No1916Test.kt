package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1916Test : StringSpec({
    "최소비용 구하기 : https://www.acmicpc.net/problem/1916" {
        val given = """
            5
            8
            1 2 2
            1 3 3
            1 4 1
            1 5 10
            2 4 2
            3 4 1
            3 5 1
            4 5 3
            1 5
        """.trimIndent()
        val expected = "4"

        No1916().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
