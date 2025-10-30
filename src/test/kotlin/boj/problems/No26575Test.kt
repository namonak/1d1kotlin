package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26575Test : StringSpec({
    "Pups : https://www.acmicpc.net/problem/26575" {
        val given = """
            3
            3 2 1
            5 .16 4.54
            3 3.7 3.6
        """.trimIndent()
        val expected = """
            $6.00
            $3.63
            $39.96
        """.trimIndent()

        No26575().solve(given.reader().buffered()) shouldBe expected
    }
})
