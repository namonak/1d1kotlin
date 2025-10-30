package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2477Test : StringSpec({
    "참외밭 : https://www.acmicpc.net/problem/2477" {
        val given = """
            7
            4 50
            2 160
            3 30
            1 60
            3 20
            1 100
        """.trimIndent()
        val expected = """
            47600
        """.trimIndent()

        No2477().solve(given.reader().buffered()) shouldBe expected
    }
})
