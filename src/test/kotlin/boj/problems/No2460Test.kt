package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2460Test : StringSpec({
    "지능형 기차 2 : https://www.acmicpc.net/problem/2460" {
        val given = """
            0 32
            3 13
            28 25
            17 5
            21 20
            11 0
            12 12
            4 2
            0 8
            21 0
        """.trimIndent()
        val output = 42

        No2460.solve(BufferedReader(given.reader())) shouldBe output
    }
})
