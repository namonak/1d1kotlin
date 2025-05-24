package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9610Test : StringSpec({
    "사분면 : https://www.acmicpc.net/problem/9610" {
        val given = """
            5
            0 0
            0 1
            1 1
            3 -3
            2 2
        """.trimIndent()
        val expected = """
            Q1: 2
            Q2: 0
            Q3: 0
            Q4: 1
            AXIS: 2
        """.trimIndent()

        No9610().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
