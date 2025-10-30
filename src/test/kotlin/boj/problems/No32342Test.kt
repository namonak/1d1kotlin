package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32342Test : StringSpec({
    "와우와 쿼리 : https://www.acmicpc.net/problem/32342" {
        val given = """
            4
            WOW
            WWO
            WOWOWWOW
            OWOOWOOW
        """.trimIndent()
        val expected = """
            1
            0
            3
            0
        """.trimIndent()

        No32342().solve(given.reader().buffered()) shouldBe expected
    }
})
