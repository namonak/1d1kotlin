package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16212Test : StringSpec({
    "정열적인 정렬 : https://www.acmicpc.net/problem/16212" {
        val given = """
            6
            14 5 8 7 1 10
        """.trimIndent()
        val expected = "1 5 7 8 10 14"

        No16212().solve(given.reader().buffered()) shouldBe expected
    }
})
