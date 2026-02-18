package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11582Test : StringSpec({
    "치킨 TOP N : https://www.acmicpc.net/problem/11582" {
        val given = """
            8
            1 5 2 4 2 9 7 3
            2
        """.trimIndent()
        val expected = "1 2 4 5 2 3 7 9"

        No11582().solve(given.reader().buffered()) shouldBe expected
    }
})
