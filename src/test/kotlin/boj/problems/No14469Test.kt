package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14469Test : StringSpec({
    "소가 길을 건너간 이유 3 : https://www.acmicpc.net/problem/14469" {
        val given = """
            3
            2 1
            8 3
            5 7
        """.trimIndent()
        val expected = "15"

        No14469().solve(given.reader().buffered()) shouldBe expected
    }
})
