package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7568Test : StringSpec({
    "덩치 : https://www.acmicpc.net/problem/7568" {
        val given = """
            5
            55 185
            58 183
            88 186
            60 175
            46 155
        """.trimIndent()
        val expected = "2 2 1 2 5"

        No7568().solve(given.reader().buffered()) shouldBe expected
    }
})
