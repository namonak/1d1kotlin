package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10823Test : StringSpec({
    "더하기 2 : https://www.acmicpc.net/problem/10823" {
        val given = """
            10,20,
            3
            0,50
            ,1
            00
        """.trimIndent()
        val expected = "210"

        No10823().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
