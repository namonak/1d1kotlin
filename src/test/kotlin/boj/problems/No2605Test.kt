package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2605Test : StringSpec({
    "줄 세우기 : https://www.acmicpc.net/problem/2605" {
        val given = """
            5
            0 1 1 3 2
        """.trimIndent()
        val output = "4 2 5 3 1"

        No2605().solve(given.reader().buffered()) shouldBe output
    }
})
