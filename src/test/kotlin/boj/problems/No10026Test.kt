package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10026Test : StringSpec({
    "적록색약 : https://www.acmicpc.net/problem/10026" {
        val given = """
            5
            RRRBB
            GGBBB
            BBBRR
            BBRRR
            RRRRR
        """.trimIndent()
        val expected = "4 3"

        No10026().solve(given.reader().buffered()) shouldBe expected
    }
})
