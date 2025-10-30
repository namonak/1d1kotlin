package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6799Test : StringSpec({
    "Computer Purchase : https://www.acmicpc.net/problem/6799" {
        val given = """
            4
            ABC 13 22 1
            DEF 10 20 30
            GHI 11 2 2
            JKL 20 20 20
        """.trimIndent()
        val expected = """
            JKL
            DEF
        """.trimIndent()

        No6799().solve(given.reader().buffered()) shouldBe expected
    }
})
