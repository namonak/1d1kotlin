package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2346Test : StringSpec({
    "풍선 터뜨리기 : https://www.acmicpc.net/problem/2346" {
        val given = """
            5
            3 2 1 -3 -1
        """.trimIndent()
        val expected = "1 4 5 3 2"

        No2346().solve(given.reader().buffered()) shouldBe expected
    }
})
