package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1389Test : StringSpec({
    "케빈 베이컨의 6단계 법칙 : https://www.acmicpc.net/problem/1389" {
        val given = """
            5 5
            1 3
            1 4
            4 5
            4 3
            3 2
        """.trimIndent()
        val expected = "3"

        No1389().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
